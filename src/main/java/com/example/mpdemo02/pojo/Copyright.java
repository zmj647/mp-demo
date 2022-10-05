package com.example.mpdemo02.pojo;


import lombok.Data;

import java.sql.Timestamp;
@Data
public class Copyright {

  private Integer id;
  private String name;
  private Integer userId;
  private Timestamp finishTime;
  private Timestamp publishTime;
  private String attachment;


}
