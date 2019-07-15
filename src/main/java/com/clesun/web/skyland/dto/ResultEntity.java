package com.clesun.web.skyland.dto;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class ResultEntity implements Serializable{
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "接口返回错误码")
    /**
     * 接口返回错误码
     */
    private int code = 0;
    @ApiModelProperty(value = "返回信息")
    /**
     * 错误信息
     */
    private String msg = "success";
    @ApiModelProperty(value = "时间戳")
    /**
     * 时间戳
     */
    private Long timestamp = System.currentTimeMillis();
    @ApiModelProperty(value = "数据")
    //数据
    private Object data = null;
    @ApiModelProperty(value = "数据数量")
    private int datasize = 0;

    public ResultEntity() {

    }

    public ResultEntity(Object data, int datasize) {
        this.code = 0;
        this.timestamp = System.currentTimeMillis();
        this.msg = "success";
        this.data = data;
        this.datasize = datasize;
    }

    public ResultEntity(Object data) {
        this.code = 0;
        this.timestamp = System.currentTimeMillis();
        this.msg = "success";
        this.data = data;
        this.datasize = 0;
    }

    public ResultEntity(int code, String msg, Object data, int datasize) {
        this.code = code;
        this.msg = msg;
        this.timestamp = timestamp;
        this.data = data;
        this.datasize = datasize;
    }

    public ResultEntity(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        if(timestamp == null){
            this.timestamp = System.currentTimeMillis();
        }
        this.timestamp = timestamp;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getDatasize() {
        if(data == null){
            return 0;
        }
        return datasize;
    }

    public void setDatasize(int datasize) {
        if(data == null){
            datasize = 0;
        }
        this.datasize = datasize;
    }

    @Override
    public String toString() {
        return "ResultEntity{" + "code=" + code + ", msg='" + msg + '\'' + ", timestamp=" + timestamp + ", data=" + data + ", datasize=" + datasize + '}';
    }
}
