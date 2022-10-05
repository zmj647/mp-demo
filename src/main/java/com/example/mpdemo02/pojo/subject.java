package com.example.mpdemo02.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.Value;

@Data
public class subject {
    private String finished;
    @TableField(value = "user_id")
    private Integer userId;
    private Integer id;
    private String name;
    private String origin;
    private String type;
    private String rank;
    private Float period;
    private String participant;
    private String attachment;
}
