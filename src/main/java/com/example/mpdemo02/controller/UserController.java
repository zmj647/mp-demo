package com.example.mpdemo02.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.mpdemo02.pojo.User;
import com.example.mpdemo02.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/all")
    public List<User> list(){
        return userService.list();
    }
    public void selectByPage(){
        QueryWrapper<User> queryWrapper = new QueryWrapper();

    }
}
