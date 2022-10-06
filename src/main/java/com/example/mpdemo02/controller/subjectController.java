package com.example.mpdemo02.controller;

import com.example.mpdemo02.pojo.Role;
import com.example.mpdemo02.pojo.subject;
import com.example.mpdemo02.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subject")
public class subjectController {
    @Autowired
    private SubjectService subjectService;
    @GetMapping("/{id}")
    public subject one(@PathVariable Integer id){
        return subjectService.getById(id);
    }
    @GetMapping("/all")
    public List<subject> all(){
        return subjectService.list();
    }
    @PostMapping("/add")
    public boolean add(subject role){
        return subjectService.save(role);
    }
    @PostMapping("/update")
    public boolean update(subject role){
        return subjectService.updateById(role);
    }
    @PostMapping("/{id}")
    public boolean del(@PathVariable Integer id){
        return subjectService.removeById(id);
    }
}
