package com.clesun.web.skyland.dto;

import io.swagger.annotations.ApiModelProperty;

/**
 * author: lixq
 * date: 2019/1/8
 * 描述: 统计实体类
 */
public class StatisticsEntity {
    /**
     * 地块数量
     */
    @ApiModelProperty(value = "地块数量")
    private Double pracelNum;

    /**
     * 种植面积
     */
    @ApiModelProperty(value = "种植面积")
    private Double plantArea;

    public Double getPracelNum() {
        return pracelNum;
    }

    public void setPracelNum(Double pracelNum) {
        this.pracelNum = pracelNum;
    }

    public Double getPlantArea() {
        return plantArea;
    }

    public void setPlantArea(Double plantArea) {
        this.plantArea = plantArea;
    }
}
