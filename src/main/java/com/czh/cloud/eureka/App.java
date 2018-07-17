package com.czh.cloud.eureka;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = "com.czh.cloud")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
