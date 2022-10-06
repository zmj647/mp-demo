package com.example.mpdemo02.controller;

import com.example.mpdemo02.pojo.CommunitySignup;
import com.example.mpdemo02.service.CommunitySignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/CommunitySignup")
public class CommunitySignupController {
    @Autowired
    private CommunitySignupService communitySignupService;
    @GetMapping("/one")
    public CommunitySignup one(Integer id){
        return communitySignupService.getById(id);
    }
    @GetMapping("/all")
    public List<CommunitySignup> all(){
        return communitySignupService.list();
    }
    @PostMapping("/add")
    public boolean add(CommunitySignup communitySignup){
        return communitySignupService.save(communitySignup);
    }
    @PostMapping("/update")
    public boolean update(CommunitySignup communitySignup){
        return communitySignupService.updateById(communitySignup);
    }
    @PostMapping("/del")
    public boolean del(Integer id){
        return communitySignupService.removeById(id);
    }
}
