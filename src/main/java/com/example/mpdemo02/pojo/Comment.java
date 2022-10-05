package com.example.mpdemo02.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

@Data
public class Comment {
    private Integer id;
    private String content;
    @TableField(value = "article_id")
    private Integer articleId;
}
