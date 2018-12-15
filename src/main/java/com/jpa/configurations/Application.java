package com.jpa.configurations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Aniruddha.Raje
 *
 */
@Configuration
@SpringBootApplication
@EnableJpaRepositories("com.jpa")
@EntityScan("com.jpa")
@ComponentScan(basePackages = "com.jpa")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}