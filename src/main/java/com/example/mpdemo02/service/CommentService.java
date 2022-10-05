package com.example.mpdemo02.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.mpdemo02.pojo.Comment;
import com.example.mpdemo02.vo.CommentWithArticleVo;

import java.util.List;

public interface CommentService extends IService<Comment> {
    List<CommentWithArticleVo> getCommentWithArticleVo();
}
