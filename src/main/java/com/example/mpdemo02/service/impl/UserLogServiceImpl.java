package com.example.mpdemo02.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mpdemo02.mapper.UserLogMapper;
import com.example.mpdemo02.pojo.UserLog;
import com.example.mpdemo02.service.UserLogService;
import org.springframework.stereotype.Service;

@Service
public class UserLogServiceImpl extends ServiceImpl<UserLogMapper, UserLog> implements UserLogService {
}
