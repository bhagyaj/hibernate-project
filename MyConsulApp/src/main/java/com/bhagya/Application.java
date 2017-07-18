package com.bhagya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by brupasinghe on 7/18/2017.
 */

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class Application {
    @Autowired
    DiscoveryClient client;
    RestTemplate restTemplate = new RestTemplate();

    @RequestMapping("/test")
    public String test(){


        System.out.print((client.getInstances("StudentService").toArray()[0]));



        String url = "http://localhost:8090/test";

        return restTemplate.getForObject(url, String.class);

    }





    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
