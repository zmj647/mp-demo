package com.example.mpdemo02;

import com.example.mpdemo02.mapper.UserMapper;
import com.example.mpdemo02.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Mpdemo02ApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void testGetAll(){
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }

}
