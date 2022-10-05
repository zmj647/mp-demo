package com.example.mpdemo02.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mpdemo02.mapper.UserinfoMapper;
import com.example.mpdemo02.pojo.Userinfo;
import com.example.mpdemo02.service.UserinfoService;
import org.springframework.stereotype.Service;

@Service
public class UserinfoServiceImpl extends ServiceImpl<UserinfoMapper, Userinfo> implements UserinfoService {
}
