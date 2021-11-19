package com.example.appengine.springboot;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
    
    @GetMapping("/datetime")
    public String fetchOperation(){

        return "Hello Deloitte CND:  "+ java.time.LocalDateTime.now().toString();
    }

}
