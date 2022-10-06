package com.example.mpdemo02.controller;

import com.example.mpdemo02.pojo.Role;
import com.example.mpdemo02.pojo.Student;
import com.example.mpdemo02.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/{id}")
    public Student one(@PathVariable Integer id){
        return studentService.getById(id);
    }
    @GetMapping("/all")
    public List<Student> all(){
        return studentService.list();
    }
    @PostMapping("/add")
    public boolean add(Student role){
        return studentService.save(role);
    }
    @PostMapping("/update")
    public boolean update(Student role){
        return studentService.updateById(role);
    }
    @PostMapping("/{id}")
    public boolean del(@PathVariable Integer id){
        return studentService.removeById(id);
    }
}
