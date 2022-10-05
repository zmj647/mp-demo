package com.example.mpdemo02.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mpdemo02.mapper.InterviewMapper;
import com.example.mpdemo02.pojo.Interview;
import com.example.mpdemo02.service.InterviewService;
import org.springframework.stereotype.Service;

@Service
public class InterviewServiceImpl extends ServiceImpl<InterviewMapper, Interview> implements InterviewService {
}
