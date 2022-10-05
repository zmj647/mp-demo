package com.example.mpdemo02.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;

@Data
@TableName(value = "article_cat")
public class ArticleCat {
    private Integer id;
    @TableField(value = "cat_name")
    private String catName;
    @TableField(value = "parent_id")
    private Integer parentId;
    @TableField(value = "show_in_nav")
    private Integer showInNav;
    @TableField(value = "sort_order")
    private Integer sortOrder;
    @TableField(value = "creat_time")
    private Timestamp createTime;
    @TableField(value = "update_time")
    private Timestamp updateTime;
    private Integer deleted;
}
