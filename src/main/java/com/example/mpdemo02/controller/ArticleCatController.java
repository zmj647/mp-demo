package com.example.mpdemo02.controller;

import com.example.mpdemo02.pojo.ArticleCat;
import com.example.mpdemo02.service.ArticleCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ArticleCat")
public class ArticleCatController {
    @Autowired
    private ArticleCatService articleCatService;
    /**
     * 查找所有
     */
    @GetMapping("/all")
    public List<ArticleCat> list(){
        return articleCatService.list();
    }
    /**
     * 增加
     */
    @PostMapping("/add")
    public boolean add(ArticleCat articleCat){
        return articleCatService.save(articleCat);
    }
    @GetMapping("/one")
    public ArticleCat one(Integer id){
        return articleCatService.getById(id);
    }
    @PostMapping("/update")
    public boolean update(ArticleCat articleCat){
        return articleCatService.updateById(articleCat);
    }
    @PostMapping("/del")
    public boolean del(Integer id){
        return articleCatService.removeById(id);
    }
}
