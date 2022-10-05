package com.example.mpdemo02.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mpdemo02.mapper.ImageMapper;
import com.example.mpdemo02.pojo.Image;
import com.example.mpdemo02.service.ImageService;
import org.springframework.stereotype.Service;

@Service
public class ImageServiceImpl extends ServiceImpl<ImageMapper, Image> implements ImageService {
}
