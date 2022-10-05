package com.example.mpdemo02.controller;

import com.example.mpdemo02.pojo.Article;
import com.example.mpdemo02.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;
    /**
     * 根据id查询对象
     */
    @GetMapping("/one")
    public Article one(Integer id){
        return articleService.getById(id);
    }
    /**
     * 查询全部
     */
    @GetMapping("/all")
    public List<Article> all(){
        return articleService.list();
    }

    /**
     * 添加数据
     * @param ac
     * @return
     */
    @PostMapping("/add")
    public boolean add(Article ac){
        return articleService.save(ac);
    }

    /**
     * 修改方法
     * @param ac
     * @return
     */
    @PostMapping("/update")
    public boolean update(Article ac){
        return articleService.updateById(ac);
    }

    /**
     * 删除方法
     * @param id
     * @return
     */
    @PostMapping("/del")
    public boolean del(Integer id){
        return articleService.removeById(id);
    }

}
