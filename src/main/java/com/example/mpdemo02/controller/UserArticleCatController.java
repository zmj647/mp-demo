package com.example.mpdemo02.controller;

import com.example.mpdemo02.pojo.Role;
import com.example.mpdemo02.pojo.UserArticleCat;
import com.example.mpdemo02.service.UserArticleCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/UserArticleCat")
public class UserArticleCatController {
    @Autowired
    private UserArticleCatService userArticleCatService;
    @GetMapping("/{id}")
    public UserArticleCat one(@PathVariable Integer id){
        return userArticleCatService.getById(id);
    }
    @GetMapping("/all")
    public List<UserArticleCat> all(){
        return userArticleCatService.list();
    }
    @PostMapping("/add")
    public boolean add(UserArticleCat role){
        return userArticleCatService.save(role);
    }
    @PostMapping("/update")
    public boolean update(UserArticleCat role){
        return userArticleCatService.updateById(role);
    }
    @PostMapping("/{id}")
    public boolean del(@PathVariable Integer id){
        return userArticleCatService.removeById(id);
    }
}
