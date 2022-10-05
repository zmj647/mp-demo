package com.example.mpdemo02.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

@Data
@TableName(value = "user_role")
public class UserRole {

  private Integer id;
  private Integer userId;
  private Timestamp updateTime;
  private Timestamp createTime;
  private String roleIds;


}
