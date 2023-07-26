package com.smtest.utils.exceptions;

public class BaseException extends RuntimeException {

    public BaseException(String msg) {
        super(msg);
    }

    @Override
    public StackTraceElement[] getStackTrace() {
        return null;
    }
}
