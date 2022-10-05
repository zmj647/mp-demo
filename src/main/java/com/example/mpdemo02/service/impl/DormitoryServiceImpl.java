package com.example.mpdemo02.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mpdemo02.mapper.DormitoryMapper;
import com.example.mpdemo02.pojo.Dormitory;
import com.example.mpdemo02.service.DormitoryService;
import org.springframework.stereotype.Service;

@Service
public class DormitoryServiceImpl extends ServiceImpl<DormitoryMapper, Dormitory> implements DormitoryService {
}
