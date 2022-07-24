package com.dev.springbootdevlocal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.dev.springbootdevlocal"})
public class SpringBootDevLocalApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDevLocalApplication.class, args);
    }

}
