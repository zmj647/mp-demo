package com.example.mpdemo02.controller;

import com.example.mpdemo02.pojo.InterviewType;
import com.example.mpdemo02.service.InterviewTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/InterviewType")
public class InterviewTypeController {
    @Autowired
    private InterviewTypeService interviewTypeService;
    @GetMapping("/one")
    public InterviewType one(Integer id){
        return interviewTypeService.getById(id);
    }
    @GetMapping("/all")
    public List<InterviewType> list(){
        return interviewTypeService.list();
    }
    @PostMapping("/add")
    public boolean add(InterviewType interviewType){
        return interviewTypeService.save(interviewType);
    }
    @PostMapping("/update")
    public boolean update(InterviewType interviewType){
        return interviewTypeService.updateById(interviewType);
    }
    @PostMapping("/del")
    public boolean del(Integer id){
        return interviewTypeService.removeById(id);
    }
}
