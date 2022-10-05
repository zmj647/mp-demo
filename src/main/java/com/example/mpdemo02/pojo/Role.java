package com.example.mpdemo02.pojo;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Role {

  private Integer deleted;
  private String description;
  private Integer status;
  private Integer id;
  private String roleName;
  private Timestamp createTime;
  private Timestamp updateTime;


}
