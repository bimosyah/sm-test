package com.smtest.controller.v1;

import com.smtest.request.LoginRequest;
import com.smtest.response.BaseResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("authenticate")
public interface AuthenticationController {
    @PostMapping
    ResponseEntity<BaseResponse> checkAuth(@RequestBody LoginRequest loginRequest) throws Exception;
}
