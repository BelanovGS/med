package com.example.med;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MedApplication {

    public static void main(String[] args) {
        SpringApplication.run(MedApplication.class, args);
        //System.out.println("hello world"); mvn clean install -DskipTests
    }

}
