package com.example.mpdemo02.pojo;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Patent {

  private String attachment;
  private Timestamp empowerTime;
  private Integer userId;
  private String name;
  private Integer id;
  private String type;

}
