package com.example.mpdemo02.controller;

import com.example.mpdemo02.pojo.ClassIfo;
import com.example.mpdemo02.service.ClassIfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ClassIfo")
public class ClassIfoController {
    @Autowired
    private ClassIfoService classIfoService;

    @GetMapping("/one")
    public ClassIfo one(Integer id){
        return classIfoService.getById(id);
    }
    @GetMapping("/all")
    public List<ClassIfo> list(){
        return classIfoService.list();
    }
    @PostMapping("/add")
    public boolean add(ClassIfo classIfo){
        return classIfoService.save(classIfo);
    }
    @PostMapping("/update")
    public boolean update(ClassIfo classIfo){
        return classIfoService.updateById(classIfo);
    }
    @PostMapping("/del")
    public boolean del(Integer id){
        return classIfoService.removeById(id);
    }
}
