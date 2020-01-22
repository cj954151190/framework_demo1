package com.chujie.framework.demo1.dao;

import com.chujie.framework.demo1.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Name:IUserDao
 * @description: IUserDao
 * @author: chu jie
 * @create: 2020/01/22 14:59
 * @version:1.0
 * @update_record:
 */
@Repository()
public interface IUserDao {
    List<User> getList();
}
