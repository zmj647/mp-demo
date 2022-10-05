package com.example.mpdemo02.pojo;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Permission {

  private Integer pid;
  private Timestamp updateTime;
  private String type;
  private Integer hasChildren;
  private Integer id;
  private String code;
  private String description;
  private String url;
  private Integer deleted;
  private Timestamp createTime;


}
