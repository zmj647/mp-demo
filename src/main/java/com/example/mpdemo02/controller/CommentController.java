package com.example.mpdemo02.controller;

import com.example.mpdemo02.pojo.Comment;
import com.example.mpdemo02.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping("/one")
    public Comment one(Integer id){
        return commentService.getById(id);
    }
    @GetMapping("/all")
    public List<Comment> add(){
        return commentService.list();
    }
    @PostMapping("/add")
    public boolean add(Comment comment){
        return commentService.save(comment);
    }
    @PostMapping("/update")
    public boolean update(Comment comment){
        return commentService.updateById(comment);
    }
    @PostMapping("/del")
    public boolean del(Integer id){
        return commentService.removeById(id);
    }

}
