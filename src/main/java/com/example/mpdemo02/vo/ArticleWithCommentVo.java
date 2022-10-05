package com.example.mpdemo02.vo;

import com.example.mpdemo02.pojo.Article;
import com.example.mpdemo02.pojo.Comment;
import lombok.Data;

import java.util.List;

@Data
public class ArticleWithCommentVo extends Article {
    private Integer id;//作者id
    private String title;//标题
    private List<Comment> commentList;//评论，多条用list封装

}
