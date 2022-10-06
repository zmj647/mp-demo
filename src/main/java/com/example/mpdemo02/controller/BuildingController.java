package com.example.mpdemo02.controller;


import com.example.mpdemo02.pojo.Building;
import com.example.mpdemo02.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Building")
public class BuildingController {

    @Autowired
    private BuildingService buildingService;

    @GetMapping("/one")
    public Building one(Integer id){
        return buildingService.getById(id);
    }
    @GetMapping("/all")
    public List<Building> list(){
        return buildingService.list();
    }
    @PostMapping("/add")
    public boolean add(Building building){
        return buildingService.save(building);
    }
    @PostMapping("/update")
    public boolean update(Building building){
        return buildingService.updateById(building);
    }
    @PostMapping("/del")
    public boolean del(Integer id){
        return buildingService.removeById(id);
    }
}
