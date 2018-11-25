package com.misha.cs.spring;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@EnableAutoConfiguration
@Configuration
@EnableTransactionManagement
@ComponentScan({"com.misha.cs.persistence"})
@EntityScan({ "com.misha.cs.persistence.model" })
@EnableJpaRepositories({"com.misha.cs.persistence.dao"})
public class JPAPersistenceConfig {

    public JPAPersistenceConfig() {
        super();
    }
}
