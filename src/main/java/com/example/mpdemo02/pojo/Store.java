package com.example.mpdemo02.pojo;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zmj
 * @since 2022-12-31 04:18:40
 */
@Data
@TableName("store")
@ApiModel(value = "Store对象", description = "")
public class Store implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("店铺id")
      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("店铺名")
    @TableField("name")
    private String name;

    @ApiModelProperty("创建店铺的用户id")
    @TableField("create_user_id")
    private Integer createUserId;

    @ApiModelProperty("图标")
    @TableField("icon")
    private String icon;

    @ApiModelProperty("店铺公告")
    @TableField("store_notice")
    private String storeNotice;

    @ApiModelProperty("店铺介绍")
    @TableField("description")
    private String description;

    @ApiModelProperty("店铺分类")
    @TableField("cat_id")
    private Integer catId;

    @ApiModelProperty("店铺电话")
    @TableField("store_phone")
    private String storePhone;

    @ApiModelProperty("地址")
    @TableField("address")
    private String address;

    @ApiModelProperty("创建时间")
    @TableField("create_time")
    private Date createTime;

    @ApiModelProperty("营业开始时间")
    @TableField("begin_time")
    private String beginTime;

    @ApiModelProperty("营业结束时间")
    @TableField("close_time")
    private String closeTime;

    /**
     * 逻辑删除
     */
    @ApiModelProperty("是否认证0：未认证，1：已认证")
    @TableField("is_authentication")
    @TableLogic
    private Integer isAuthentication;


}
