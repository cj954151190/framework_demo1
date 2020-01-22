package com.chujie.framework.demo1.service;

import com.chujie.framework.demo1.entity.User;

import java.util.List;

/**
 * @Name:IUserService
 * @description: IUserService
 * @author: chu jie
 * @create: 2020/01/22 11:39
 * @version:1.0
 * @update_record:
 */
public interface IUserService {
    List<User> getList();
}
