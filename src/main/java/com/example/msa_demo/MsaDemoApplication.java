package com.example.msa_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MsaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsaDemoApplication.class, args);
    }

}

@RestController
class start{
    @GetMapping
    public String hello(){
        return "hello haley";
    }
}
