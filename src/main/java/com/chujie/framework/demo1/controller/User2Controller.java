package com.chujie.framework.demo1.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.chujie.framework.demo1.dao.User2Mapper;
import com.chujie.framework.demo1.entity.User2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Name:User2Controller
 * @description: User2Controller
 * @author: chu jie
 * @create: 2020/01/22 19:20
 * @version:1.0
 * @update_record:
 */
@RestController
@RequestMapping("/demo2")
public class User2Controller {
    @Autowired
    User2Mapper user2Mapper;
    @RequestMapping("/user2s")
    public List<User2> getList() {
        List<User2> list = user2Mapper.selectList(null);
        for( User2 user2 : list) {
            System.out.println(user2.toString());
        }
        return list;
    }
}