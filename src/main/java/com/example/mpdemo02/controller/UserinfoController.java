package com.example.mpdemo02.controller;

import com.example.mpdemo02.pojo.Role;
import com.example.mpdemo02.pojo.Userinfo;
import com.example.mpdemo02.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Userinfo")
public class UserinfoController {
    @Autowired
    private UserinfoService userinfoService;
    @GetMapping("/{id}")
    public Userinfo one(@PathVariable Integer id){
        return userinfoService.getById(id);
    }
    @GetMapping("/all")
    public List<Userinfo> all(){
        return userinfoService.list();
    }
    @PostMapping("/add")
    public boolean add(Userinfo role){
        return userinfoService.save(role);
    }
    @PostMapping("/update")
    public boolean update(Userinfo role){
        return userinfoService.updateById(role);
    }
    @PostMapping("/{id}")
    public boolean del(@PathVariable Integer id){
        return userinfoService.removeById(id);
    }
}
