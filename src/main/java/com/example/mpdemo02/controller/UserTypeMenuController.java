package com.example.mpdemo02.controller;

import com.example.mpdemo02.pojo.Role;
import com.example.mpdemo02.pojo.UserTypeMenu;
import com.example.mpdemo02.service.UserTypeMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/UserTypeMenu")
public class UserTypeMenuController {
    @Autowired
    private UserTypeMenuService userTypeMenuService;
    @GetMapping("/{id}")
    public UserTypeMenu one(@PathVariable Integer id){
        return userTypeMenuService.getById(id);
    }
    @GetMapping("/all")
    public List<UserTypeMenu> all(){
        return userTypeMenuService.list();
    }
    @PostMapping("/add")
    public boolean add(UserTypeMenu role){
        return userTypeMenuService.save(role);
    }
    @PostMapping("/update")
    public boolean update(UserTypeMenu role){
        return userTypeMenuService.updateById(role);
    }
    @PostMapping("/{id}")
    public boolean del(@PathVariable Integer id){
        return userTypeMenuService.removeById(id);
    }
}
