package com.chujie.framework.demo1.service.service.impl;

import com.chujie.framework.demo1.dao.IUserDao;
import com.chujie.framework.demo1.entity.User;
import com.chujie.framework.demo1.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Name:UserServiceImpl
 * @description: UserServiceImpl
 * @author: chu jie
 * @create: 2020/01/22 11:40
 * @version:1.0
 * @update_record:
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    IUserDao iUserDao;
    public List<User> getList(){
        return iUserDao.getList();
    }
}