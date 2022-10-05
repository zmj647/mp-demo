package com.example.mpdemo02.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mpdemo02.mapper.RegionMapper;
import com.example.mpdemo02.pojo.Region;
import com.example.mpdemo02.service.RegionService;
import org.springframework.stereotype.Service;

@Service
public class RegionServiceImpl extends ServiceImpl<RegionMapper, Region> implements RegionService {
}
