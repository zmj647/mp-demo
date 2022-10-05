package com.example.mpdemo02.pojo;


import lombok.Data;

import java.sql.Timestamp;

@Data
public class Teacher {

  private String depart;
  private String professional;
  private String school;
  private Integer userId;
  private String teacherName;
  private Timestamp createTime;
  private String teacherNo;
  private Integer id;
  private Timestamp updateTime;

}
