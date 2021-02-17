package com.company.service;

import java.util.HashMap;
import java.util.Map;

import org.jbpm.services.api.ProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@Autowired
	ProcessService processService;
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    @PostMapping("/create")
    public Order createOrder(@RequestBody Order order) {
    	Map<String, Object> value=new HashMap<>();
    	value.put("input", order);
    	processService.startProcess("business-application-kjar-1_0-SNAPSHOT", "home-demo-1.srit-home", value);
    	return order;
    }

}