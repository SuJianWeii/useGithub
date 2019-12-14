package com.sc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author sunchao
 * @email jo.sun.courage@hotmail.com
 * @Version 1.0
 **/

@RestController

//打印消息
public class HelloController {

    @RequestMapping("info")
    public String info() {
        return "Hello, SpringBoot";
    }
}