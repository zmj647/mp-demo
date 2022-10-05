package com.example.mpdemo02.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "frontend_menu")
public class FrontendMenu {

  private Integer menuSort;
  private Integer id;
  private String menuName;
  private String menuUrl;
  private Integer pid;
  private String description;
  private Integer hasChildren;


}
