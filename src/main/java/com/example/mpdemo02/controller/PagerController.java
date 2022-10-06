package com.example.mpdemo02.controller;

import com.example.mpdemo02.pojo.Pager;
import com.example.mpdemo02.service.PagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Pager")
public class PagerController {
    @Autowired
    private PagerService pagerService;
    @GetMapping("/{id}")
    public Pager one(@PathVariable Integer id){
        return pagerService.getById(id);
    }
    @GetMapping("/all")
    public List<Pager> list(){
        return pagerService.list();
    }
    @PostMapping("/add")
    public boolean add(Pager pager){
        return pagerService.save(pager);
    }
    @PostMapping("/update")
    public boolean update(Pager pager){
        return pagerService.updateById(pager);
    }
    @PostMapping("/{id}")
    public boolean del(@PathVariable Integer id){
        return pagerService.removeById(id);
    }
}
