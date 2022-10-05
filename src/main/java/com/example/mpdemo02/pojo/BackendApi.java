package com.example.mpdemo02.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "backend_api")
public class BackendApi {
    private Integer id;
    @TableField(value = "api_name")
    private String apiName;
    @TableField(value = "api_url")
    private String method;
    @TableField(value = "api_method")
    private String apiMethod;
    private Integer pid;
    @TableField(value = "api_sort")
    private Integer apiSort;
    private String description;
}
