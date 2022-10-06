package com.example.mpdemo02.controller;

import com.example.mpdemo02.pojo.Role;
import com.example.mpdemo02.pojo.UserCourse;
import com.example.mpdemo02.service.UserCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/UserCourse")
public class UserCourseController {
    @Autowired
    private UserCourseService userCourseService;
    @GetMapping("/{id}")
    public UserCourse one(@PathVariable Integer id){
        return userCourseService.getById(id);
    }
    @GetMapping("/all")
    public List<UserCourse> all(){
        return userCourseService.list();
    }
    @PostMapping("/add")
    public boolean add(UserCourse role){
        return userCourseService.save(role);
    }
    @PostMapping("/update")
    public boolean update(UserCourse role){
        return userCourseService.updateById(role);
    }
    @PostMapping("/{id}")
    public boolean del(@PathVariable Integer id){
        return userCourseService.removeById(id);
    }
}
