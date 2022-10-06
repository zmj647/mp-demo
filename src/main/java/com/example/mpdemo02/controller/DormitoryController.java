package com.example.mpdemo02.controller;


import com.example.mpdemo02.pojo.Dormitory;
import com.example.mpdemo02.service.DormitoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Dormitory")
public class DormitoryController {
    @Autowired
    private DormitoryService dormitoryService;
    @GetMapping("/one")
    public Dormitory one(Integer id){
        return dormitoryService.getById(id);
    }
    @GetMapping("/all")
    public List<Dormitory> list(){
        return dormitoryService.list();
    }
    @PostMapping("/add")
    public boolean add(Dormitory dormitory){
        return dormitoryService.save(dormitory);
    }
    @PostMapping("/update")
    public boolean update(Dormitory dormitory){
        return dormitoryService.updateById(dormitory);
    }
    @PostMapping("/del")
    public boolean del(Integer id){
        return dormitoryService.removeById(id);
    }
}
