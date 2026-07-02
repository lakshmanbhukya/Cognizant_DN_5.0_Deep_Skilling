package com.cognizant.spring_learn.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        log.info("Hello Controller Called");
        log.info("Started");
        String str = "Hello World!";
        log.info("handled /hello, End");
        return str;
    }
}
