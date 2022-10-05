package com.example.mpdemo02.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mpdemo02.mapper.CompetitionSignupMapper;
import com.example.mpdemo02.pojo.CompetitionSignup;
import com.example.mpdemo02.service.CompetitionSignupService;
import org.springframework.stereotype.Service;

@Service
public class CompetitionSignupServiceImpl extends ServiceImpl<CompetitionSignupMapper, CompetitionSignup> implements CompetitionSignupService {
}