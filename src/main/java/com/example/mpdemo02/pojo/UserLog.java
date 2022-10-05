package com.example.mpdemo02.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

@Data
@TableName(value = "user_log")
public class UserLog {

  private Timestamp createTime;
  private String log;
  private Integer id;
  private Integer userId;
}
