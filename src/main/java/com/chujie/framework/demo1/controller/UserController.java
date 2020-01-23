package com.chujie.framework.demo1.controller;

import com.chujie.framework.demo1.entity.User;
import com.chujie.framework.demo1.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Name:UserController
 * @description: UserController
 * @author: chu jie
 * @create: 2020/01/22 11:41
 * @version:1.0
 * @update_record:
 */
@RestController
@RequestMapping("/demo1")
public class UserController {
//    @Autowired
//    IUserService userService;
//    @RequestMapping("/users")
//    public List<User> getList() {
//        return userService.getList();
//    }
}