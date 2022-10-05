package com.example.mpdemo02.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mpdemo02.mapper.UserArticleCatMapper;
import com.example.mpdemo02.pojo.UserArticleCat;
import com.example.mpdemo02.service.UserArticleCatService;
import org.springframework.stereotype.Service;

@Service
public class UserArticleCatServiceImpl extends ServiceImpl<UserArticleCatMapper, UserArticleCat> implements UserArticleCatService {
}
