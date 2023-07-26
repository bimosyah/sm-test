package com.smtest.utils.exceptions;

public class TooManyRequestException extends BaseException {
    public TooManyRequestException() {
        super("Too Many Api Call !");
    }
}
