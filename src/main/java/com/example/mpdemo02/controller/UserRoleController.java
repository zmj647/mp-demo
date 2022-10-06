package com.example.mpdemo02.controller;

import com.example.mpdemo02.pojo.Role;
import com.example.mpdemo02.pojo.UserRole;
import com.example.mpdemo02.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/UserRole")
public class UserRoleController {
    @Autowired
    private UserRoleService userRoleService;
    @GetMapping("/{id}")
    public UserRole one(@PathVariable Integer id){
        return userRoleService.getById(id);
    }
    @GetMapping("/all")
    public List<UserRole> all(){
        return userRoleService.list();
    }
    @PostMapping("/add")
    public boolean add(UserRole role){
        return userRoleService.save(role);
    }
    @PostMapping("/update")
    public boolean update(UserRole role){
        return userRoleService.updateById(role);
    }
    @PostMapping("/{id}")
    public boolean del(@PathVariable Integer id){
        return userRoleService.removeById(id);
    }
}
