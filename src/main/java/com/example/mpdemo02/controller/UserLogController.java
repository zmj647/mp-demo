package com.example.mpdemo02.controller;

import com.example.mpdemo02.pojo.Role;
import com.example.mpdemo02.pojo.UserLog;
import com.example.mpdemo02.service.RoleService;
import com.example.mpdemo02.service.UserLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/UserLog")
public class UserLogController {
    @Autowired
    private UserLogService userLogService;
    @GetMapping("/{id}")
    public UserLog one(@PathVariable Integer id){
        return userLogService.getById(id);
    }
    @GetMapping("/all")
    public List<UserLog> all(){
        return userLogService.list();
    }
    @PostMapping("/add")
    public boolean add(UserLog role){
        return userLogService.save(role);
    }
    @PostMapping("/update")
    public boolean update(UserLog role){
        return userLogService.updateById(role);
    }
    @PostMapping("/{id}")
    public boolean del(@PathVariable Integer id){
        return userLogService.removeById(id);
    }

}
