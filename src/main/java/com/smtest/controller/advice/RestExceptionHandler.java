package com.smtest.controller.advice;

import com.smtest.response.BaseResponse;
import com.smtest.utils.ResponseHelper;
import com.smtest.utils.exceptions.BadRequestException;
import com.smtest.utils.exceptions.TooManyRequestException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Order(Ordered.HIGHEST_PRECEDENCE)
@RestControllerAdvice
@Slf4j
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(BadRequestException.class)
    protected ResponseEntity<BaseResponse> handleBadRequest(BadRequestException ex) {
        ex.printStackTrace();
        log.warn("handleBadRequest: {}", ex.getMessage());
        return ResponseHelper.buildBadRequestResponse(ex.getMessage());
    }

    @ExceptionHandler(TooManyRequestException.class)
    protected ResponseEntity<BaseResponse> handleTooManyRequest(TooManyRequestException ex) {
        ex.printStackTrace();
        log.warn("handleTooManyRequest: {}", ex.getMessage());
        return ResponseHelper.buildTooManyConnection(ex.getMessage());
    }
}
