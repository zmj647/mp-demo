package com.example.mpdemo02.controller;

import com.example.mpdemo02.pojo.Interview;
import com.example.mpdemo02.service.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Interview")
public class InterviewController {
    @Autowired
    private InterviewService interviewService;
    @GetMapping("/one")
    public Interview one(Integer id){
        return interviewService.getById(id);
    }
    @GetMapping("/all")
    public List<Interview> list(){
        return interviewService.list();
    }
    @PostMapping("/add")
    public boolean add(Interview interview){
        return interviewService.save(interview);
    }
    @PostMapping("/update")
    public boolean update(Interview interview){
        return interviewService.updateById(interview);
    }
    @PostMapping("/del")
    public boolean del(Integer id){
        return interviewService.removeById(id);
    }
}
