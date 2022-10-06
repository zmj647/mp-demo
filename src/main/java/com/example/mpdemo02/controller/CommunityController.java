package com.example.mpdemo02.controller;

import com.example.mpdemo02.pojo.Community;
import com.example.mpdemo02.pojo.CommunitySignup;
import com.example.mpdemo02.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Community")
public class CommunityController {
    @Autowired
    private CommunityService communityService;

    @GetMapping("/one")
    public Community one(Integer id){
        return communityService.getById(id);
    }
    @GetMapping("/all")
    public List<Community> list(){
        return communityService.list();
    }
    @PostMapping("/add")
    public boolean add(Community community){
        return communityService.save(community);
    }
    @PostMapping("/update")
    public boolean update(Community community){
        return communityService.updateById(community);
    }
    @PostMapping("/del")
    public boolean del(Integer id){
        return communityService.removeById(id);
    }
}
