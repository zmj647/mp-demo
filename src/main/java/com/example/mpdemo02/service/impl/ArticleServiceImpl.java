package com.example.mpdemo02.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mpdemo02.mapper.ArticleMapper;
import com.example.mpdemo02.pojo.Article;
import com.example.mpdemo02.service.ArticleService;
import com.example.mpdemo02.vo.ArticleWithCommentVo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {
    @Override
    public List<ArticleWithCommentVo> getArticleWithCommentVo() {
        return null;
    }
}
