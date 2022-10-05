package com.example.mpdemo02.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mpdemo02.mapper.CopyrightMapper;
import com.example.mpdemo02.pojo.Copyright;
import com.example.mpdemo02.service.CopyrightService;
import org.springframework.stereotype.Service;

@Service
public class CopyrightServiceImpl extends ServiceImpl<CopyrightMapper, Copyright> implements CopyrightService {
}
