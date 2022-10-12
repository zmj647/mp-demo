package com.example.mpdemo02.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.mpdemo02.pojo.Article;
import com.example.mpdemo02.vo.ArticleWithCommentVo;

import java.util.List;

public interface ArticleService extends IService<Article> {
    List<ArticleWithCommentVo> getArticleWithCommentVo();

    ArticleWithCommentVo getArticleId(Integer id);
}
