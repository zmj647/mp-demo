package com.example.mpdemo02.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mpdemo02.mapper.CommentMapper;
import com.example.mpdemo02.service.CommentService;
import com.example.mpdemo02.vo.CommentWithArticleVo;
import org.springframework.stereotype.Service;
import com.example.mpdemo02.pojo.Comment;

import java.util.List;

@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

    @Override
    public List<CommentWithArticleVo> getCommentWithArticleVo() {
        return null;
    }
}
