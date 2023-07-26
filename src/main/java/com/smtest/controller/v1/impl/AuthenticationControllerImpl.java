package com.smtest.controller.v1.impl;

import com.smtest.config.jwt.JwtTokenUtil;
import com.smtest.config.jwt.JwtUserDetailsService;
import com.smtest.controller.v1.AuthenticationController;
import com.smtest.request.LoginRequest;
import com.smtest.response.BaseResponse;
import com.smtest.utils.ResponseHelper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
@RestController
public class AuthenticationControllerImpl implements AuthenticationController {
    private final AuthenticationManager authenticationManager;
    private final JwtTokenUtil jwtTokenUtil;
    private final JwtUserDetailsService jwtUserDetailsService;

    @Override
    public ResponseEntity<BaseResponse> checkAuth(LoginRequest loginRequest) throws Exception {
        authenticate(loginRequest.getUsername(), loginRequest.getPassword());

        final UserDetails userDetails = jwtUserDetailsService.loadUserByUsername(loginRequest.getUsername());
        final String token = jwtTokenUtil.generateToken(userDetails);
        return ResponseHelper.buildOkResponse(token);
    }

    private void authenticate(String username, String password) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        }

    }
}
