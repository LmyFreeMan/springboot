package com.web.controller;

import com.web.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

@Controller
class TestController {
    @Autowired
    public Person person;
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){

        return "Hello,World";
    }
    @ResponseBody
    @RequestMapping("/test")
    public String test(){
        System.out.println(person);
        return "x";
    }
    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","<h1>您好</h1>");
        map.put("users", Arrays.asList("张三","李四","王五"));
        return "/test/success";
    }
    @RequestMapping("/login")
    public String login(){
        return "back/login";
    }
    @RequestMapping("/dash")
    public String dash(){
        return "back/dashboard";
    }


}
