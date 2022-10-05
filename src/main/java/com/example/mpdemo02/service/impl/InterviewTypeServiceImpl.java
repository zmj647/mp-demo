package com.example.mpdemo02.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mpdemo02.mapper.InterviewTypeMapper;
import com.example.mpdemo02.pojo.InterviewType;
import com.example.mpdemo02.service.InterviewTypeService;
import org.springframework.stereotype.Service;

@Service
public class InterviewTypeServiceImpl extends ServiceImpl<InterviewTypeMapper, InterviewType> implements InterviewTypeService {
}
