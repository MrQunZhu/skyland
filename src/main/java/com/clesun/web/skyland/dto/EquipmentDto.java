package com.clesun.web.skyland.dto;

import io.swagger.annotations.ApiModelProperty;

/**
 * author: lixq
 * date: 2019/1/12
 * 描述: 设备工具类
 */
public class EquipmentDto {
    /**
     * 设备数量
     */
    @ApiModelProperty(value = "设备数量")
    private Integer num;

    /**
     * 设备类型
     */
    @ApiModelProperty(value = "设备类型")
    private String type;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
