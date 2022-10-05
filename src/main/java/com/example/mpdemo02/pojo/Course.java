package com.example.mpdemo02.pojo;


import lombok.Data;

import java.sql.Timestamp;
@Data
public class Course {

  private String courseType;
  private String courseNo;
  private Integer id;
  private String name;
  private String nameEn;
  private String description;
  private Timestamp createTime;
  private Timestamp updateTime;
  private String depart;
  private Integer state;
  private String major;
  private Integer deleted;
  private String school;

}
