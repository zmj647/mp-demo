package com.example.mpdemo02.controller;

import com.example.mpdemo02.pojo.Memorabilia;
import com.example.mpdemo02.service.MemorabiliaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Memorabilia")
public class MemorabiliaController {
    @Autowired
    private MemorabiliaService memorabiliaService;
    @GetMapping("/one")
    public Memorabilia one(Integer id){
        return memorabiliaService.getById(id);
    }
    @GetMapping("/all")
    public List<Memorabilia> list(){
        return memorabiliaService.list();
    }
    @PostMapping("/add")
    public boolean add(Memorabilia memorabilia){
        return memorabiliaService.save(memorabilia);
    }
    @PostMapping("/update")
    public boolean update(Memorabilia memorabilia){
        return memorabiliaService.updateById(memorabilia);
    }
    @PostMapping("/del")
    public boolean del(Integer id){
        return memorabiliaService.removeById(id);
    }
}
