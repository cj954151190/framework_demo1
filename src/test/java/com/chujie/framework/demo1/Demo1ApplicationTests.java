package com.chujie.framework.demo1;

import com.chujie.framework.demo1.dao.User2Mapper;
import com.chujie.framework.demo1.entity.User2;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class Demo1ApplicationTests {

    @Autowired
    User2Mapper user2Mapper;

    @Test
    void contextLoads() {
        List<User2> list = user2Mapper.selectList(null);
        for( User2 user2 : list ) {
            System.out.println( user2 );
        }
    }

}
