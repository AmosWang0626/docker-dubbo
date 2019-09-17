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
@EnableDubbo(scanBasePackages = "com.amos.provider.dubbo.service.impl")
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
