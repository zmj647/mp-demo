package com.example.mpdemo02.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName(value = "community_signup")
@Data
public class CommunitySignup {
    private Integer id;
    @TableField(value = "student_id")
    private Integer studentId;
    @TableField(value = "community_id")
    private Integer communityId;
    @TableField(value = "create_time")
    private Integer checked;
}
