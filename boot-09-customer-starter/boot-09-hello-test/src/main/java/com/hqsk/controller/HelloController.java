package com.hqsk.controller;

import com.hqsk.hello.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    HelloService helloService;
    @GetMapping("/sayHello/{username}")
    public String sayHello(@PathVariable("username") String username){
        return helloService.sayHello(username);
    }
}
