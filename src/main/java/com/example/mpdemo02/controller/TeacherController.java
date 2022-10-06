package com.example.mpdemo02.controller;

import com.example.mpdemo02.pojo.Role;
import com.example.mpdemo02.pojo.Teacher;
import com.example.mpdemo02.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    @GetMapping("/{id}")
    public Teacher one(@PathVariable Integer id){
        return teacherService.getById(id);
    }
    @GetMapping("/all")
    public List<Teacher> all(){
        return teacherService.list();
    }
    @PostMapping("/add")
    public boolean add(Teacher role){
        return teacherService.save(role);
    }
    @PostMapping("/update")
    public boolean update(Teacher role){
        return teacherService.updateById(role);
    }
    @PostMapping("/{id}")
    public boolean del(@PathVariable Integer id){
        return teacherService.removeById(id);
    }
}
