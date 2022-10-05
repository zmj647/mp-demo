package com.example.mpdemo02.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mpdemo02.mapper.CompetitionMapper;
import com.example.mpdemo02.pojo.Competition;
import com.example.mpdemo02.service.CompetitionService;
import org.springframework.stereotype.Service;

@Service
public class CompetitionServiceImpl extends ServiceImpl<CompetitionMapper, Competition> implements CompetitionService {
}
