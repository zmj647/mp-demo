package com.example.mpdemo02.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "role_frontend_menu")
public class RoleFrontendMenu {

  private String frontendMenuIds;
  private String roleId;
  private Integer id;


}
