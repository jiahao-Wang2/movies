package com.movies.common;


public class BaseException extends Exception {

    private String message;

    public BaseException(String message) {
        super(message);
    }

}
