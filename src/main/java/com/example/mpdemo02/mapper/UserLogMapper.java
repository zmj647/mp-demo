package com.example.mpdemo02.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mpdemo02.pojo.UserLog;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserLogMapper extends BaseMapper<UserLog> {
}
