package com.example.mpdemo02.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mpdemo02.mapper.PatentMapper;
import com.example.mpdemo02.pojo.Patent;
import com.example.mpdemo02.service.PatentService;
import org.springframework.stereotype.Service;

@Service
public class PatentServiceImpl extends ServiceImpl<PatentMapper, Patent> implements PatentService {
}
