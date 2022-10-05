package com.example.mpdemo02.pojo;


import lombok.Data;

import java.sql.Timestamp;
@Data
public class Department {

  private Integer id;
  private String departName;
  private String departCode;
  private String departDesc;
  private Integer schoolId;
  private Timestamp createTime;
  private Timestamp updateTime;
  private String departType;
  private Integer deleted;


}
