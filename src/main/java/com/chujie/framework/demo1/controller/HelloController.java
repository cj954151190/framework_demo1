package com.chujie.framework.demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Name:HelloController
 * @description: HelloController
 * @author: chu jie
 * @create: 2020/01/22 11:38
 * @version:1.0
 * @update_record:
 */
@RestController
@RequestMapping("/demo1")
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}