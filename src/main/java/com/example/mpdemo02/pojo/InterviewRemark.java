package com.example.mpdemo02.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

@Data
@TableName(value = "interview_remark")
public class InterviewRemark {

  private Integer interviewId;
  private Integer id;
  private String content;
  private Timestamp createTime;

}
