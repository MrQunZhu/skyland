package com.clesun.web.skyland.dto;

import io.swagger.annotations.ApiModelProperty;

/**
 * author: lixq
 * date: 2019/1/8
 * 描述: 地力等级统计
 */
public class AreaDto {
    /**
     * 地块面积
     */
    @ApiModelProperty(value = "地块面积")
    private Double area;

    /**
     * 名称
     */
    @ApiModelProperty(value = "地力等级")
    private String areaLevel;

    /**
     * 名称
     */
    @ApiModelProperty(value = "地块类型")
    private String areaType;

    /**
     * 责任单位
     */
    @ApiModelProperty(value = "责任单位")
    private String ownerUnit;

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public String getAreaLevel() {
        return areaLevel;
    }

    public void setAreaLevel(String areaLevel) {
        this.areaLevel = areaLevel;
    }

    public String getAreaType() {
        return areaType;
    }

    public void setAreaType(String areaType) {
        this.areaType = areaType;
    }

    public String getOwnerUnit() {
        return ownerUnit;
    }

    public void setOwnerUnit(String ownerUnit) {
        this.ownerUnit = ownerUnit;
    }
}
