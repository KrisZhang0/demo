package com.imooc.demo.entity;

import lombok.Data;

import java.util.Date;

/**
 * 区域实体类
 */
@Data
public class Area {

    //主键Id
    private Integer areaId;

    //名称
    private String areaName;

    //权重 越大越排前显示
    private Integer priority;

    //创建时间
    private Date createTime;

    //更新时间
    private Date updateTime;

}
