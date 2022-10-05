package com.example.mpdemo02.vo;

import com.example.mpdemo02.pojo.Article;
import com.example.mpdemo02.pojo.Comment;
import lombok.Data;

@Data
public class CommentWithArticleVo extends Comment {
    private Integer id;
    private String content;
    private Article article;//文章，一个文章有多条评论，故文章对象就一个
}
