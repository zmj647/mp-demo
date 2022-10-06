package com.example.mpdemo02.controller;

import com.example.mpdemo02.pojo.Patent;
import com.example.mpdemo02.service.PatentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Patent")
public class PatentController {
    @Autowired
    private PatentService patentService;
    @GetMapping("/{id}")
    public Patent one(@PathVariable Integer id){
        return patentService.getById(id);
    }
    @GetMapping("/all")
    public List<Patent> list(){
        return patentService.list();
    }
    @PostMapping("/add")
    public boolean add(Patent patent){
        return patentService.save(patent);
    }
    @PostMapping("/update")
    public boolean update(Patent patent){
        return patentService.updateById(patent);
    }
    @PostMapping("/{id}")
    public boolean del(@PathVariable Integer id){
        return patentService.removeById(id);
    }
}
