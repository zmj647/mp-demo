package com.example.mpdemo02.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mpdemo02.mapper.BackendApiMapper;
import com.example.mpdemo02.pojo.BackendApi;
import com.example.mpdemo02.service.BackendApiService;
import org.springframework.stereotype.Service;

@Service
public class BackendApiServiceImpl extends ServiceImpl<BackendApiMapper, BackendApi> implements BackendApiService {
}
