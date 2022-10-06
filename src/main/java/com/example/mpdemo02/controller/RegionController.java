package com.example.mpdemo02.controller;

import com.example.mpdemo02.pojo.Question;
import com.example.mpdemo02.pojo.Region;
import com.example.mpdemo02.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Region")
public class RegionController {
    @Autowired
    private RegionService regionService;
    @GetMapping("/{id}")
    public Region one(@PathVariable Integer id){
        return regionService.getById(id);
    }
    @GetMapping("/all")
    public List<Region> all(){
        return regionService.list();
    }
    @PostMapping("/add")
    public boolean add(Region question){
        return regionService.save(question);
    }
    @PostMapping("/update")
    public boolean update(Region question){
        return regionService.updateById(question);
    }
    @PostMapping("/{id}")
    public boolean del(@PathVariable Integer id){
        return regionService.removeById(id);
    }
}
