package com.example.mpdemo02.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mpdemo02.mapper.QuestionMapper;
import com.example.mpdemo02.pojo.Question;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question> implements com.example.mpdemo02.service.QuestionServiceImpl {
}
