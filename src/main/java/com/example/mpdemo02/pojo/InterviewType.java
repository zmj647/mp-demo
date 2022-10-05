package com.example.mpdemo02.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "interview_type")
public class InterviewType {

  private Integer id;
  private String typeName;

}
