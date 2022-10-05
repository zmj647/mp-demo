package com.example.mpdemo02.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mpdemo02.mapper.UserTypeMenuMapper;
import com.example.mpdemo02.pojo.UserTypeMenu;
import com.example.mpdemo02.service.UserTypeMenuService;
import org.springframework.stereotype.Service;

@Service
public class UserTypeMenuServiceImpl extends ServiceImpl<UserTypeMenuMapper, UserTypeMenu> implements UserTypeMenuService {
}
