package com.clesun.web.skyland.dto;

import io.swagger.annotations.ApiModelProperty;

import java.sql.Timestamp;


/**
 * author: lixq
 * date: 2019/1/19
 * 描述: 投入品工具类
 */
public class InputDto {

    @ApiModelProperty(value = "投入品用量")
    private Double amount;

    @ApiModelProperty(value = "投入品使用年份")
    private Integer opertime;

    @ApiModelProperty(value = "投入品名称")
    private String inputName;

    @ApiModelProperty(value = "投入品编号")
    private String inputCode;

    @ApiModelProperty(value = "投入品类型")
    private String inputType;

    @ApiModelProperty(value = "生产厂商")
    private String manufacturer;

    @ApiModelProperty(value = "使用说明")
    private String instructions;

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getOpertime() {
        return opertime;
    }

    public void setOpertime(Integer opertime) {
        this.opertime = opertime;
    }

    public String getInputName() {
        return inputName;
    }

    public void setInputName(String inputName) {
        this.inputName = inputName;
    }

    public String getInputCode() {
        return inputCode;
    }

    public void setInputCode(String inputCode) {
        this.inputCode = inputCode;
    }

    public String getInputType() {
        return inputType;
    }

    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
}
