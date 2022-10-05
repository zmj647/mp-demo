package com.example.mpdemo02.pojo;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Memorabilia {

  private Timestamp updateTime;
  private Integer id;
  private Integer userId;
  private Timestamp createTime;
  private String content;
  private Timestamp happenTime;


}
