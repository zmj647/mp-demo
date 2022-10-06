package com.example.mpdemo02.controller;


import com.example.mpdemo02.pojo.InterviewRemark;
import com.example.mpdemo02.service.InterviewRemarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/InterviewRemark")
public class InterviewRemarkController {
    @Autowired
    private InterviewRemarkService interviewRemarkService;
    @GetMapping("/one")
    public InterviewRemark one(Integer id){
        return interviewRemarkService.getById(id);
    }
    @GetMapping("/all")
    public List<InterviewRemark> list(){
        return interviewRemarkService.list();
    }
    @PostMapping("/add")
    public boolean add(InterviewRemark interviewRemark){
        return interviewRemarkService.save(interviewRemark);
    }
    @PostMapping("/update")
    public boolean update(InterviewRemark interviewRemark){
        return interviewRemarkService.updateById(interviewRemark);
    }
    @PostMapping("/del")
    public boolean del(Integer id){
        return interviewRemarkService.removeById(id);
    }
}
