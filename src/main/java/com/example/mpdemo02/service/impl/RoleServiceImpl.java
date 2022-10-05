package com.example.mpdemo02.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mpdemo02.mapper.RoleMapper;
import com.example.mpdemo02.pojo.Role;
import com.example.mpdemo02.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {
}
