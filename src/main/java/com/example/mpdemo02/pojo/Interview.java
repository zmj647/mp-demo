package com.example.mpdemo02.pojo;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Interview {

  private String analysis;
  private Integer id;
  private String title;
  private Integer interviewType;
  private Timestamp createTime;
  private Timestamp updateTime;
  private Integer deleted;
  private Integer userinfoId;


}
