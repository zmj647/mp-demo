package com.example.mpdemo02.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mpdemo02.mapper.CommunitySignupMapper;
import com.example.mpdemo02.pojo.CommunitySignup;
import com.example.mpdemo02.service.CommunitySignupService;
import org.springframework.stereotype.Service;

@Service
public class CommunitySignupServiceImpl extends ServiceImpl<CommunitySignupMapper, CommunitySignup> implements CommunitySignupService {
}
