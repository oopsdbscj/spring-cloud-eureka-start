package com.tab.feignclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by tab chan on 11/12/2017
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
@Controller
public class EurekaFeignClientApp {
    @Autowired
    private GreetingClient greetingClient;

    @RequestMapping("/get-greeting")
    public String greeting(Model model){
        model.addAttribute("greeting",greetingClient.greeting());
        return "greeting-view";
    }

    public static void main(String[] args){
        SpringApplication.run(EurekaFeignClientApp.class,args);
    }

}
