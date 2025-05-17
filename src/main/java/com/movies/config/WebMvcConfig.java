package com.movies.config;

import com.movies.interceptor.UserInterceptor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/*
* WebMvc的配置类,再此使自定义拦截器注册并生效
* */
@Configuration
@RequiredArgsConstructor
public class WebMvcConfig extends WebMvcConfigurationSupport {

    private final UserInterceptor userInterceptor;

    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(userInterceptor);
    }
    /*
    * knife4j配置,用于Controller层的测试
    * */
    @Bean
    public Docket docket(){
        ApiInfo apiInfo = new ApiInfoBuilder()
                .title("在线电影")
                .version("1.0")
                .description("在线电影项目接口文档")
                .build();
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("用户端接口")
                .apiInfo(apiInfo)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.movies.controller"))
                .paths(PathSelectors.any())
                .build();
    }



}
