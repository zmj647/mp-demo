package com.example.mpdemo02.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

@Data
@TableName(value = "role_permission")
public class RolePermission {

  private Timestamp updateTime;
  private Integer id;
  private Integer roleId;
  private String permissionIds;
  private Timestamp createTime;

}
