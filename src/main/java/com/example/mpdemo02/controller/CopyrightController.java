package com.example.mpdemo02.controller;


import com.example.mpdemo02.pojo.Copyright;
import com.example.mpdemo02.service.CopyrightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Copyright")
public class CopyrightController {
    @Autowired
    private CopyrightService copyrightService;
    @GetMapping("/one")
    public Copyright one(Integer id){
        return copyrightService.getById(id);
    }
    @GetMapping("/all")
    public List<Copyright> all(){
        return copyrightService.list();
    }
    @PostMapping("/add")
    public boolean add(Copyright copyright){
        return copyrightService.save(copyright);
    }
    @PostMapping("/update")
    public boolean update(Copyright copyright){
        return copyrightService.updateById(copyright);
    }
    @PostMapping("/del")
    public boolean del(Integer id){
        return copyrightService.removeById(id);
    }
}
