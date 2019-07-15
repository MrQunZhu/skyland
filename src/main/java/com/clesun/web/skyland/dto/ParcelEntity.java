package com.clesun.web.skyland.dto;

import com.clesun.web.skyland.entity.Parcel;
import io.swagger.annotations.ApiModelProperty;

/**
 * author: lixq
 * date: 2019/1/8
 * 描述:
 */
public class ParcelEntity extends Parcel {
    /**
     * 空间数据
     */
    @ApiModelProperty(value = "空间数据")
    private String theGeomStr;

    public String getTheGeomStr() {
        return theGeomStr;
    }

    public void setTheGeomStr(String theGeomStr) {
        this.theGeomStr = theGeomStr;
    }
}
