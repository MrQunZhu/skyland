package com.clesun.web.skyland.dto;

import com.clesun.web.skyland.entity.Base;
import com.vividsolutions.jts.geom.Geometry;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;

/**
 * author: lixq
 * date: 2019/1/8
 * 描述:
 */
public class BaseEntity extends Base {
    @ApiModelProperty(value = "空间数据")
    private String shapes;

    public String getShapes() {
        return shapes;
    }

    public void setShapes(String shapes) {
        this.shapes = shapes;
    }
}
