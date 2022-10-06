package com.example.mpdemo02.controller;

import com.example.mpdemo02.pojo.Major;
import com.example.mpdemo02.service.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Major")
public class MajorController {
    @Autowired
    public MajorService majorService;
    @GetMapping("/{id}")
    public Major one(@PathVariable Integer id){
        return majorService.getById(id);
    }
    @GetMapping("/all")
    public List<Major> liat(){
        return majorService.list();
    }
    @PostMapping("/add")
    public boolean add(Major major){
        return majorService.save(major);
    }
    @PostMapping("/update")
    public boolean update(Major major){
        return majorService.updateById(major);
    }
    @PostMapping("del")
    public boolean del(Integer id){
        return majorService.removeById(id);
    }
}
