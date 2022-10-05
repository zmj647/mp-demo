package com.example.mpdemo02.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mpdemo02.mapper.MajorMapper;
import com.example.mpdemo02.pojo.Major;
import com.example.mpdemo02.service.MajorService;
import org.springframework.stereotype.Service;

@Service
public class MajorServiceImpl extends ServiceImpl<MajorMapper, Major> implements MajorService {
}
