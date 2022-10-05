package com.example.mpdemo02.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;

@Data
public class Article {
   /* private Integer id;
    private String title;
    private String content;
    private Integer userId;*/
    private Timestamp createTime;
    private Integer id;
    private Integer userArticleCatId;
    private String title;
    private String content;
    private Timestamp updateTime;
    private Integer deleted;
    private Integer courseId;
    private Integer open;

}
