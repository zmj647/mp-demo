package com.example.mpdemo02.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

@Data
public class Competition {
    private String start;
    private String type;
    private Integer id;
    private String name;
    private String content;
    @TableField(value = "home_page")
    private String homePage;
    private String rank;
    @TableField(value = "school_id")
    private Integer schoolID;
    private String organizer;
    private String end;
}
