package com.example.mpdemo02.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mpdemo02.mapper.UserCourseMapper;
import com.example.mpdemo02.pojo.UserCourse;
import com.example.mpdemo02.service.UserCourseService;
import org.springframework.stereotype.Service;

@Service
public class UserCourseServiceImpl extends ServiceImpl<UserCourseMapper, UserCourse> implements UserCourseService {
}
