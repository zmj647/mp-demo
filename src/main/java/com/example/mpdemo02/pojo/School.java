package com.example.mpdemo02.pojo;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class School {

  private String city;
  private String address;
  private String description;
  private Double enable;
  private String area;
  private Integer id;
  private String province;
  private String schoolName;
  private String latitude;
  private String longitude;
  private Timestamp createTime;
  private Timestamp updateTime;
  private Integer deleted;

}
