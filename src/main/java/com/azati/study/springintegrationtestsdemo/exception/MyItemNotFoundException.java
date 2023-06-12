package com.azati.study.springintegrationtestsdemo.exception;

public class MyItemNotFoundException extends RuntimeException {
    public MyItemNotFoundException(String message) {
        super(message);
    }
}
