package com.example.mpdemo02.controller;

import com.example.mpdemo02.pojo.Question;
import com.example.mpdemo02.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Question")
public class QuestionController {
    @Autowired
    private QuestionService questionService;
    @GetMapping("/{id}")
    public Question one(@PathVariable Integer id){
        return questionService.getById(id);
    }
    @GetMapping("/all")
    public List<Question> all(){
        return questionService.list();
    }
    @PostMapping("/add")
    public boolean add(Question question){
        return questionService.save(question);
    }
    @PostMapping("/update")
    public boolean update(Question question){
        return questionService.updateById(question);
    }
    @PostMapping("/{id}")
    public boolean del(@PathVariable Integer id){
        return questionService.removeById(id);
    }
}
