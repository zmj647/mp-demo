package com.example.mpdemo02.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "user_type_menu")
public class UserTypeMenu {

  private String userType;
  private Integer id;
  private String menuIds;


}
