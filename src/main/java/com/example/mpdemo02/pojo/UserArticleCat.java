package com.example.mpdemo02.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

@Data
@TableName(value = "user_article_cat")
public class UserArticleCat {

  private Timestamp createTime;
  private String userArticleCatIds;
  private Integer userId;
  private Integer deleted;
  private Integer id;
  private Timestamp updateTime;


}
