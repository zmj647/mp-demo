package com.example.mpdemo02.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mpdemo02.mapper.FrontendMenuMapper;
import com.example.mpdemo02.pojo.FrontendMenu;
import com.example.mpdemo02.service.FrontendMenuService;
import org.springframework.stereotype.Service;

@Service
public class FrontendMenuServiceImpl extends ServiceImpl<FrontendMenuMapper,FrontendMenu> implements FrontendMenuService {
}
