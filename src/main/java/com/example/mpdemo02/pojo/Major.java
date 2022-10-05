package com.example.mpdemo02.pojo;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Major {

  private Integer deleted;
  private String majorDesc;
  private Integer id;
  private String majorName;
  private Integer departId;
  private Timestamp createTime;
  private Timestamp updateTime;
  private Integer schoolId;

}
