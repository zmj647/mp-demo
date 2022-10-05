package com.example.mpdemo02.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

@Data
public class Building {
    private Integer id;
    private String name;
    private Integer chager;
    @TableField(value = "school_id")
    private Integer schooledId;
}
