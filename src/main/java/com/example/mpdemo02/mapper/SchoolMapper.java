package com.example.mpdemo02.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mpdemo02.pojo.School;
import org.apache.ibatis.annotations.Mapper;

import javax.annotation.ManagedBean;

@Mapper
public interface SchoolMapper extends BaseMapper<School> {
}
