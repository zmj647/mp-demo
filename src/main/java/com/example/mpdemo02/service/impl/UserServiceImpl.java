package com.example.mpdemo02.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mpdemo02.dto.PageDto;
import com.example.mpdemo02.mapper.UserMapper;
import com.example.mpdemo02.pojo.User;
import com.example.mpdemo02.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {
    @Override
    public List<User> query(QueryWrapper<User> userQueryWrapper) {
        return this.list(query());
    }

    @Override
    public Page<User> query(PageDto pageDto) {
        return this.page(new Page<>(pageDto.getCurrent(),pageDto.getSize()));
    }
}
