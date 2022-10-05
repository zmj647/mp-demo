package com.example.mpdemo02.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mpdemo02.mapper.ClassIfoMapper;
import com.example.mpdemo02.pojo.ClassIfo;
import com.example.mpdemo02.service.ClassIfoService;
import org.springframework.stereotype.Service;

@Service
public class ClassIfoServiceImpl extends ServiceImpl<ClassIfoMapper, ClassIfo> implements ClassIfoService {
}
