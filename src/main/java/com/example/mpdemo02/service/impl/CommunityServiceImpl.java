package com.example.mpdemo02.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mpdemo02.mapper.CommunityMapper;
import com.example.mpdemo02.pojo.Community;
import com.example.mpdemo02.service.CommunityService;
import org.springframework.stereotype.Service;

@Service
public class CommunityServiceImpl extends ServiceImpl<CommunityMapper, Community> implements CommunityService {
}
