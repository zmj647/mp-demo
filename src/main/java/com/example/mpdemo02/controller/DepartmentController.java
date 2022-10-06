package com.example.mpdemo02.controller;

import com.example.mpdemo02.pojo.Department;
import com.example.mpdemo02.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @GetMapping("/one")
    public Department one(Integer id){
        return departmentService.getById(id);
    }
    @GetMapping("/all")
    public List<Department> list(){
        return departmentService.list();
    }
    @PostMapping("/add")
    public boolean add(Department department){
        return departmentService.save(department);
    }
    @PostMapping("/update")
    public boolean update(Department department){
        return departmentService.updateById(department);
    }
    @PostMapping("/del")
    public boolean del(Integer id){
        return departmentService.removeById(id);
    }
}
