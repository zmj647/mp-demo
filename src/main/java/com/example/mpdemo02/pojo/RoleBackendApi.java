package com.example.mpdemo02.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "role_backend_api")
public class RoleBackendApi {

  private Integer id;
  private Integer roleId;
  private String backendApiIds;

}
