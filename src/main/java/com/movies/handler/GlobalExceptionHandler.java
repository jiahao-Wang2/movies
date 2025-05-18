package com.movies.handler;


import com.movies.common.BaseException;
import com.movies.common.Result;
import io.swagger.v3.oas.annotations.Hidden;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
@Hidden
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public Result handleException(BaseException e) {
        log.error(e.getMessage());
        return Result.error(e.getMessage());
    }

}
