package com.example.mpdemo02.controller;

import com.example.mpdemo02.pojo.Question;
import com.example.mpdemo02.pojo.QuestionCate;
import com.example.mpdemo02.service.QuestionCateService;
import com.example.mpdemo02.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/QuestionCate")
public class QuestionCateController {
    @Autowired
    private QuestionCateService questionCateService;
    @GetMapping("/{id}")
    public QuestionCate one(@PathVariable Integer id){
        return questionCateService.getById(id);
    }
    @GetMapping("/all")
    public List<QuestionCate> all(){
        return questionCateService.list();
    }
    @PostMapping("/add")
    public boolean add(QuestionCate questionCate){
        return questionCateService.save(questionCate);
    }
    @PostMapping("/update")
    public boolean update(QuestionCate questionCate){
        return questionCateService.updateById(questionCate);
    }
    @PostMapping("/{id}")
    public boolean del(@PathVariable Integer id){
        return questionCateService.removeById(id);
    }
}
