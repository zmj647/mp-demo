package com.example.mpdemo02.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

@Data
@TableName(value = "user_course")
public class UserCourse {

  private String term;
  private String courseIds;
  private Integer deleted;
  private Integer id;
  private String year;
  private Timestamp updateTime;
  private Timestamp createTime;
  private Integer userinfoId;

}
