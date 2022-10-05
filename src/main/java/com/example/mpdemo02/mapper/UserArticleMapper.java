package com.example.mpdemo02.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mpdemo02.pojo.UserArticle;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserArticleMapper extends BaseMapper<UserArticle> {
}
