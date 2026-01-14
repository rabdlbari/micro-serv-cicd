package com.serv1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaServer
public class Serv1Application {

    public static void main(String[] args) {
        SpringApplication.run(Serv1Application.class, args);
    }

}
