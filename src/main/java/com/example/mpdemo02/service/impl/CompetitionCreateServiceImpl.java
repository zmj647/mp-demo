package com.example.mpdemo02.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mpdemo02.mapper.CompetitionCreateMapper;
import com.example.mpdemo02.pojo.CompetitionCreate;
import com.example.mpdemo02.service.CompetitionCreateService;
import org.springframework.stereotype.Service;

@Service
public class CompetitionCreateServiceImpl extends ServiceImpl<CompetitionCreateMapper, CompetitionCreate> implements CompetitionCreateService {
}
