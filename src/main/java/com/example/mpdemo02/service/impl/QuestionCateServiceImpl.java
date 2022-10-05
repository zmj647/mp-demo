package com.example.mpdemo02.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mpdemo02.mapper.QuestionCateMapper;
import com.example.mpdemo02.pojo.QuestionCate;
import com.example.mpdemo02.service.QuestionCateService;
import org.springframework.stereotype.Service;

@Service
public class QuestionCateServiceImpl extends ServiceImpl<QuestionCateMapper, QuestionCate> implements QuestionCateService {
}
