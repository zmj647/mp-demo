package com.example.mpdemo02.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;

@Data
public class Community {
    private String description;
    private Integer id;
    private String name;
    private Integer type;
    private String teachers;
    private Integer depart;
    private String logo;
    private Integer charger;
    private Integer status;
    private String address;
    private String mobile;
    private String email;
    private String weixin;
    @TableField(value = "school_id")
    private Integer schoolID;
    @TableField(value = "create_time")
    private Timestamp createTime;
    @TableField(value = "update_time")
    private Timestamp dateTime;
    private Integer version;
    private Integer deleted;
}
