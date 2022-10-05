package com.example.mpdemo02.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mpdemo02.mapper.ArticleCatMapper;
import com.example.mpdemo02.pojo.ArticleCat;
import com.example.mpdemo02.service.ArticleCatService;
import org.springframework.stereotype.Service;

@Service
public class ArticleCatServiceImpl extends ServiceImpl<ArticleCatMapper, ArticleCat> implements ArticleCatService {
}
