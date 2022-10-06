package com.example.mpdemo02.controller;

import com.example.mpdemo02.pojo.Role;
import com.example.mpdemo02.pojo.UserArticle;
import com.example.mpdemo02.service.UserArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/UserArticle")
public class UserArticleController {
    @Autowired
    private UserArticleService userArticleService;
    @GetMapping("/{id}")
    public UserArticle one(@PathVariable Integer id){
        return userArticleService.getById(id);
    }
    @GetMapping("/all")
    public List<UserArticle> all(){
        return userArticleService.list();
    }
    @PostMapping("/add")
    public boolean add(UserArticle role){
        return userArticleService.save(role);
    }
    @PostMapping("/update")
    public boolean update(UserArticle role){
        return userArticleService.updateById(role);
    }
    @PostMapping("/{id}")
    public boolean del(@PathVariable Integer id){
        return userArticleService.removeById(id);
    }
}
