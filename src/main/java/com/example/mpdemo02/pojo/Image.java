package com.example.mpdemo02.pojo;


import lombok.Data;

import java.sql.Timestamp;
@Data
public class Image {

  private Timestamp createTime;
  private Integer id;
  private String imgUrl;
  private String name;
  private Timestamp updateTime;
  private Integer width;
  private Integer height;


}
