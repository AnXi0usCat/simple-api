package com.misha.cs.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.misha.cs.service"})
public class ServiceConfig {

    public ServiceConfig() {
        super();
    }
}