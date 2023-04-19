package org.lanqiao.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }
    // @GetMapping
    // @RequestParam
    @RequestMapping(value = "/hello",method = RequestMethod.GET,params = {"name"})
    public String login4(String name){
        return "Hello Lanqiao";
    }
}
