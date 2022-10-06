package com.example.mpdemo02.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mpdemo02.mapper.InterviewRemarkMapper;
import com.example.mpdemo02.pojo.InterviewRemark;
import com.example.mpdemo02.service.InterviewRemarkService;
import org.springframework.stereotype.Service;

@Service
public class InterviewRemarkServiceImpl extends ServiceImpl<InterviewRemarkMapper, InterviewRemark> implements InterviewRemarkService {
}
