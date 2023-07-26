package com.smtest.config.jwt;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.smtest.response.BaseResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@RequiredArgsConstructor
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException authException) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        BaseResponse response = new BaseResponse();

        response.setData("Unauthorized");
        response.setSuccess(false);
        String json = mapper.writeValueAsString(response);

        httpServletResponse.setContentType(MediaType.APPLICATION_JSON_VALUE);
        httpServletResponse.setStatus(401);
        httpServletResponse.getWriter().write(json);
    }
}
