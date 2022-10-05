package com.example.mpdemo02.pojo;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Student {

  private Timestamp createTime;
  private String classinfo;
  private String studentNo;
  private java.sql.Timestamp updateTime;
  private String studentName;
  private String major;
  private Integer id;
  private Integer userId;
  private String depart;
  private String school;


}
