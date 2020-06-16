package com.xiaojihua.springbootstarttest.controller;

import com.xiaojihu.xiaojihuaspringbootautoconfigration.service.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //自动注入starter中自动配置的类
    @Autowired
    private HelloService helloService;

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name){
        return helloService.sayHello(name);
    }
}
