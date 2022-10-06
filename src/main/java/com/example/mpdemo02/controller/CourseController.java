package com.example.mpdemo02.controller;


import com.example.mpdemo02.pojo.Course;
import com.example.mpdemo02.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Course")
public class CourseController {
    @Autowired
    private CourseService courseService;
    @GetMapping("/one")
    public Course one(Integer id){
        return courseService.getById(id);
    }
    @GetMapping("/all")
    public List<Course> list(){
        return courseService.list();
    }
    @PostMapping("/add")
    private boolean add(Course course){
        return courseService.save(course);
    }
    @PostMapping("/update")
    private boolean update(Course course){
        return courseService.updateById(course);
    }
    @PostMapping("/del")
    private boolean del(Integer id){
        return courseService.removeById(id);
    }
}
