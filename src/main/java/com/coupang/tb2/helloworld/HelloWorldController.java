package com.coupang.tb2.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @GetMapping
    @ResponseBody
    public String helloWorld() {
        return "Hello, World!";
    }

    @GetMapping("/test")
    @ResponseBody
    public String test() {
        return "Hello, World! Test";
    }
}
