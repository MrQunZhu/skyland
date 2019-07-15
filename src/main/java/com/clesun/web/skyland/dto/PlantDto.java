package com.clesun.web.skyland.dto;

import io.swagger.annotations.ApiModelProperty;

/**
 * author: lixq
 * date: 2019/1/19
 * 描述: 作物工具类
 */
public class PlantDto {
    /**
     * 种植面积
     */
    @ApiModelProperty(value = "种植面积")
    private Double plantArea;

    /**
     * 作物名称
     */
    @ApiModelProperty(value = "作物名称")
    private String plantName;

    /**
     * 地块数量
     */
    @ApiModelProperty(value = "地块数量")
    private Integer parceNum;

    public Double getPlantArea() {
        return plantArea;
    }

    public void setPlantArea(Double plantArea) {
        this.plantArea = plantArea;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    public Integer getParceNum() {
        return parceNum;
    }

    public void setParceNum(Integer parceNum) {
        this.parceNum = parceNum;
    }
}
