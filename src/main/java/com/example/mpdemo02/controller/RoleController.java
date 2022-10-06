package com.example.mpdemo02.controller;

import com.example.mpdemo02.pojo.Question;
import com.example.mpdemo02.pojo.Role;
import com.example.mpdemo02.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Role")
public class RoleController {
    @Autowired
    private RoleService roleService;
    @GetMapping("/{id}")
    public Role one(@PathVariable Integer id){
        return roleService.getById(id);
    }
    @GetMapping("/all")
    public List<Role> all(){
        return roleService.list();
    }
    @PostMapping("/add")
    public boolean add(Role role){
        return roleService.save(role);
    }
    @PostMapping("/update")
    public boolean update(Role role){
        return roleService.updateById(role);
    }
    @PostMapping("/{id}")
    public boolean del(@PathVariable Integer id){
        return roleService.removeById(id);
    }
}
