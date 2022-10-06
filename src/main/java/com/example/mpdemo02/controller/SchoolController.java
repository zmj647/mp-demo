package com.example.mpdemo02.controller;

import com.example.mpdemo02.pojo.Role;
import com.example.mpdemo02.pojo.School;
import com.example.mpdemo02.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/School")
public class SchoolController {
    @Autowired
    private SchoolService schoolService;
    @GetMapping("/{id}")
    public School one(@PathVariable Integer id){
        return schoolService.getById(id);
    }
    @GetMapping("/all")
    public List<School> all(){
        return schoolService.list();
    }
    @PostMapping("/add")
    public boolean add(School role){
        return schoolService.save(role);
    }
    @PostMapping("/update")
    public boolean update(School role){
        return schoolService.updateById(role);
    }
    @PostMapping("/{id}")
    public boolean del(@PathVariable Integer id){
        return schoolService.removeById(id);
    }
}
