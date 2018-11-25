package com.misha.cs.spring;

import com.misha.common.web.RestResponseEntityExceptionHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({ // @formatter:off
        ServiceConfig.class,
        WebConfig.class,
        JPAPersistenceConfig.class,
        SecurityConfig.class,
        RestResponseEntityExceptionHandler.class
}) // @formatter:on
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}