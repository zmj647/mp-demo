package com.example.mpdemo02.controller;


import com.example.mpdemo02.pojo.FrontendMenu;
import com.example.mpdemo02.service.FrontendMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/FrontendMenu")
public class FrontendMenuController {
    @Autowired
    private FrontendMenuService frontendMenuService;
    @GetMapping("/one")
    public FrontendMenu one(Integer id){
        return frontendMenuService.getById(id);
    }
    @GetMapping("/all")
    public List<FrontendMenu> list(){
        return frontendMenuService.list();
    }
    @PostMapping("/add")
    public boolean add(FrontendMenu frontendMenu){
        return frontendMenuService.save(frontendMenu);
    }
    @PostMapping("/update")
    public boolean update(FrontendMenu frontendMenu){
        return  frontendMenuService.updateById(frontendMenu);
    }
    @PostMapping("/del")
    public boolean del(Integer id){
        return frontendMenuService.removeById(id);
    }
}
