package com.trace;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class Service3Application {

    @Autowired
    RestTemplate restTemplate;

    @Bean
    RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(Service3Application.class, args);
    }

    @RequestMapping("/test")
    public String test(){
        System.out.println("Service-3 called... from /test");
        return "Svc3 is responding ...";
    }
    
    @RequestMapping("/call3")
    public String call3(){
        System.out.println("Service-3 called...");
        return "Service-3 is called ...";
    }
}
