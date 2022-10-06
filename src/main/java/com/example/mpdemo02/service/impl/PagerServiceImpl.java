package com.example.mpdemo02.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mpdemo02.mapper.PagerMapper;
import com.example.mpdemo02.pojo.Pager;
import com.example.mpdemo02.service.PagerService;
import org.springframework.stereotype.Service;

@Service
public class PagerServiceImpl extends ServiceImpl<PagerMapper, Pager> implements PagerService {
}
