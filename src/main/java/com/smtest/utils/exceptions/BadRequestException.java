package com.smtest.utils.exceptions;

public class BadRequestException extends BaseException {
    public BadRequestException(String data) {
        super(data);
    }
    public BadRequestException(){
        this("Terdapat parameter kosong");
    }
}
