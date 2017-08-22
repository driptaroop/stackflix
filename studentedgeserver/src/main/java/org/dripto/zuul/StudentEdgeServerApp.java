package org.dripto.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class StudentEdgeServerApp {
    public static void main(String[] args) {
        SpringApplication.run(StudentEdgeServerApp.class, args);
    }
}
