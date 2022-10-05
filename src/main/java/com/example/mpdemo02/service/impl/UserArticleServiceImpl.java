package com.example.mpdemo02.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mpdemo02.mapper.UserArticleMapper;
import com.example.mpdemo02.pojo.UserArticle;
import com.example.mpdemo02.service.UserArticleService;
import org.springframework.stereotype.Service;

@Service
public class UserArticleServiceImpl extends ServiceImpl<UserArticleMapper, UserArticle> implements UserArticleService {
}
