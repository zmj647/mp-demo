package com.example.mpdemo02.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.mpdemo02.dto.PageDto;
import com.example.mpdemo02.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserService extends IService<User> {
    List<User> query(QueryWrapper<User> userQueryWrapper);

    Page<User> query(PageDto pageDto);
}
