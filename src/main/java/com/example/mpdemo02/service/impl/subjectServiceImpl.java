package com.example.mpdemo02.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mpdemo02.mapper.subjectMapper;
import com.example.mpdemo02.pojo.subject;
import com.example.mpdemo02.service.subjectService;
import org.springframework.stereotype.Service;

@Service
public class subjectServiceImpl extends ServiceImpl<subjectMapper, subject> implements subjectService {
}
