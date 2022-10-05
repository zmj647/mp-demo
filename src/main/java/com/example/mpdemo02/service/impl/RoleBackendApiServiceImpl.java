package com.example.mpdemo02.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mpdemo02.mapper.RoleBackendApiMapper;
import com.example.mpdemo02.pojo.RoleBackendApi;
import com.example.mpdemo02.service.RoleBackendApiService;
import org.springframework.stereotype.Service;

@Service
public class RoleBackendApiServiceImpl extends ServiceImpl<RoleBackendApiMapper, RoleBackendApi> implements RoleBackendApiService {
}
