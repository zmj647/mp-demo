package com.example.mpdemo02.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mpdemo02.mapper.ArticleMapper;
import com.example.mpdemo02.pojo.Article;
import com.example.mpdemo02.pojo.Comment;
import com.example.mpdemo02.service.ArticleService;
import com.example.mpdemo02.service.CommentService;
import com.example.mpdemo02.vo.ArticleWithCommentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {
    @Autowired
    private CommentService commentService;
    @Override
    public List<ArticleWithCommentVo> getArticleWithCommentVo() {
        return null;
    }

    @Override
    public ArticleWithCommentVo getArticleId(Integer id) {
        Article article = this.getById(id);//先根据id获得对应的作者
        QueryWrapper<Comment> queryWrapper = new QueryWrapper<>();//条件构造器
        queryWrapper.eq("article_id",article.getId());//设置条件，如果评论表作者id与上面查的id相等
        List<Comment> commentList = commentService.list(queryWrapper);//就查出对应的评论集合
        ArticleWithCommentVo articleWithCommentVo = new ArticleWithCommentVo();
        //将获得到的信息传入Vo需要的字段
        articleWithCommentVo.setId(article.getId());
        articleWithCommentVo.setTitle(article.getTitle());
        articleWithCommentVo.setCommentList(commentList);
        return articleWithCommentVo;
    }

}
