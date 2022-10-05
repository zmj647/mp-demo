package com.example.mpdemo02.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;

@Data
@TableName(value = "competition_create")
public class CompetitionCreate {

  private Timestamp updateTime;
  private Timestamp endTime;
  private Integer id;
  private Integer userId;
  private String title;
  private String content;
  private Timestamp startTime;
  private Integer signup;
  private String target;
  private String type;
  private Timestamp createTime;
  private Integer deleted;
  private Integer aimCompetition;
  private Integer state;
  private Integer checked;
  private Integer schoolId;


}
