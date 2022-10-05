package com.example.mpdemo02.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mpdemo02.mapper.SchoolMapper;
import com.example.mpdemo02.pojo.School;
import com.example.mpdemo02.service.SchoolService;
import org.springframework.stereotype.Service;

@Service
public class SchoolServiceImpl extends ServiceImpl<SchoolMapper, School> implements SchoolService {
}
