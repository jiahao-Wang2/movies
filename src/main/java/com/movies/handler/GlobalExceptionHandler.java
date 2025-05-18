/*package com.movies.handler;


import com.movies.common.BaseException;
import com.movies.common.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

*//*
* 全局异常处理器
* *//*
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    *//*
    * 统一的异常处理方法
    * *//*
    @ExceptionHandler
    public Result exceptionHandler(BaseException ex){
        log.error(ex.getMessage());
        return Result.error(ex.getMessage());
    }

}*/
