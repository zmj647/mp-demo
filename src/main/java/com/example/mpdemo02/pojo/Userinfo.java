package com.example.mpdemo02.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class Userinfo {

  private Integer binding;
  private Integer state;
  private Integer deleted;
  private Integer id;
  private String userName;
  private String password;
  private String token;
  private Timestamp updateTime;
  private Timestamp createTime;
  private String userType;


}
