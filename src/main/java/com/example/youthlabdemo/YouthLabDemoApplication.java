package com.example.youthlabdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class YouthLabDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(YouthLabDemoApplication.class, args);
    }

}
