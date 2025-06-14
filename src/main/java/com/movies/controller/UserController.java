package com.movies.controller;

import com.movies.common.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@Tag(name = "用户相关业务")//swagger注解
@RequestMapping
public class UserController {

    @GetMapping("hi")
    @Operation(summary = "你好呀")//swagger注解
    public Result sayHello() {
        return Result.success("hello");
    }


}
