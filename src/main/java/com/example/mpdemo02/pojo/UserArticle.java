package com.example.mpdemo02.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

@Data
@TableName(value = "user_article")
public class UserArticle {

  private java.sql.Timestamp createTime;
  private Integer articleId;
  private Integer deleted;
  private Integer userId;
  private Timestamp updateTime;
  private Integer id;

}
