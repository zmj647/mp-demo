package com.example.mpdemo02.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

@Data
@TableName(value = "competition_signup")
public class CompetitionSignup {

  private Integer id;
  private Integer studentId;
  private Integer competitionId;
  private Timestamp createTime;
  private Integer checked;


}
