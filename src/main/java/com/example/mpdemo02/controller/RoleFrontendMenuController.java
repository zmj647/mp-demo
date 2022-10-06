package com.example.mpdemo02.controller;

import com.example.mpdemo02.pojo.Role;
import com.example.mpdemo02.pojo.RoleFrontendMenu;
import com.example.mpdemo02.service.RoleFrontendMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/RoleFrontendMenu")
public class RoleFrontendMenuController {
    @Autowired
    private RoleFrontendMenuService roleFrontendMenuService;
    @GetMapping("/{id}")
    public RoleFrontendMenu one(@PathVariable Integer id){
        return roleFrontendMenuService.getById(id);
    }
    @GetMapping("/all")
    public List<RoleFrontendMenu> all(){
        return roleFrontendMenuService.list();
    }
    @PostMapping("/add")
    public boolean add(RoleFrontendMenu role){
        return roleFrontendMenuService.save(role);
    }
    @PostMapping("/update")
    public boolean update(RoleFrontendMenu role){
        return roleFrontendMenuService.updateById(role);
    }
    @PostMapping("/{id}")
    public boolean del(@PathVariable Integer id){
        return roleFrontendMenuService.removeById(id);
    }
}
