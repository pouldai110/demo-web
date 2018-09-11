package com.demo.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@ComponentScan(basePackages={"com.demo"})
@EnableAutoConfiguration
@Configuration
@EnableJpaRepositories(basePackages = "com.demo.dao")
@EntityScan(basePackages="com.demo.model")
@EnableSpringDataWebSupport
public class Applocation extends SpringBootServletInitializer {
    @Override
    public  SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Applocation.class);
    }

    public static void main(String[] args){ SpringApplication.run(Applocation.class, args);
    }
}
