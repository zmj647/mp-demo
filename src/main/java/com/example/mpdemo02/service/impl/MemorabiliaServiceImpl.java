package com.example.mpdemo02.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mpdemo02.mapper.MemorabiliaMapper;
import com.example.mpdemo02.pojo.Memorabilia;
import com.example.mpdemo02.service.MemorabiliaService;
import org.springframework.stereotype.Service;

@Service
public class MemorabiliaServiceImpl extends ServiceImpl<MemorabiliaMapper, Memorabilia> implements MemorabiliaService {
}
