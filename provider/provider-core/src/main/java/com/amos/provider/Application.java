package com.amos.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring boot project
 *
 * @author Daoyuan
 */
@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.amos.provider.business.impl")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
