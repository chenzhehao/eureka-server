package com.czh.cloud.eureka;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication(scanBasePackages = "com.czh.cloud")
public class BootOfEurekaServer {

    public static void main(String[] args) {
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("windows")) {
            System.setProperty("log.path", "D:/chenzhehao/workspace/czh");
        } else {
            System.setProperty("log.path", "/Users/chenzhehao/Documents/springcloud");
        }
        System.setProperty("context.name", "eureka-server");

        SpringApplication.run(BootOfEurekaServer.class, args);
    }
}
