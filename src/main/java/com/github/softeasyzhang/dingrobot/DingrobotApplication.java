package com.github.softeasyzhang.dingrobot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DingrobotApplication {

    public static void main(String[] args) {
        SpringApplication.run(DingrobotApplication.class, args);
    }

}
