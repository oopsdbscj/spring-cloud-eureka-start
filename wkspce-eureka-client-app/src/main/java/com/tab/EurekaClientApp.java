package com.tab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by tab chan on 11/11/2017
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class EurekaClientApp {
    public static void main(String[] args){
        SpringApplication.run(EurekaClientApp.class,args);
    }

    @RequestMapping("/greeting")
    public String   greeting(){
        return "Hello from EurekaClient";
    }
}
