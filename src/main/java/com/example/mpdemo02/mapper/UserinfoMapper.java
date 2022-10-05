package com.example.mpdemo02.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mpdemo02.pojo.Userinfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserinfoMapper extends BaseMapper<Userinfo> {
}
