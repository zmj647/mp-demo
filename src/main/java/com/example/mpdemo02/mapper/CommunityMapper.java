package com.example.mpdemo02.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mpdemo02.pojo.Community;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommunityMapper extends BaseMapper<Community> {
}