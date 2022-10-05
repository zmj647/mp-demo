package com.example.mpdemo02.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mpdemo02.mapper.ClassRoomMapper;
import com.example.mpdemo02.pojo.ClassRoom;
import com.example.mpdemo02.service.ClassRoomService;
import org.springframework.stereotype.Service;

@Service
public class ClassRoomServiceImpl extends ServiceImpl<ClassRoomMapper, ClassRoom> implements ClassRoomService {
}
