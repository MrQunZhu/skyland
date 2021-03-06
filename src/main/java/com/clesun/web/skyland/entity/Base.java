package com.clesun.web.skyland.entity;

import io.swagger.annotations.ApiModelProperty;

public class Base {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BASE.OBJECTID
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    @ApiModelProperty(value = "objectid")
    private Integer objectid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BASE.Id
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    @ApiModelProperty(value = "id")
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BASE.MJ
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    @ApiModelProperty(value = "面积")
    private Double mj;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BASE.MC
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    @ApiModelProperty(value = "名称")
    private String mc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BASE.LXR
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    @ApiModelProperty(value = "联系人")
    private String lxr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BASE.LXFS
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    @ApiModelProperty(value = "联系方式")
    private String lxfs;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BASE.DZ
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    @ApiModelProperty(value = "地址")
    private String dz;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BASE.PIC
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    @ApiModelProperty(value = "图片")
    private String pic;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BASE.MS
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    @ApiModelProperty(value = "描述")
    private String ms;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BASE.Shape
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    private byte[] shape;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BASE.OBJECTID
     *
     * @return the value of BASE.OBJECTID
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    public Integer getObjectid() {
        return objectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BASE.OBJECTID
     *
     * @param objectid the value for BASE.OBJECTID
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    public void setObjectid(Integer objectid) {
        this.objectid = objectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BASE.Id
     *
     * @return the value of BASE.Id
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BASE.Id
     *
     * @param id the value for BASE.Id
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BASE.MJ
     *
     * @return the value of BASE.MJ
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    public Double getMj() {
        return mj;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BASE.MJ
     *
     * @param mj the value for BASE.MJ
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    public void setMj(Double mj) {
        this.mj = mj;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BASE.MC
     *
     * @return the value of BASE.MC
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    public String getMc() {
        return mc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BASE.MC
     *
     * @param mc the value for BASE.MC
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    public void setMc(String mc) {
        this.mc = mc == null ? null : mc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BASE.LXR
     *
     * @return the value of BASE.LXR
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    public String getLxr() {
        return lxr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BASE.LXR
     *
     * @param lxr the value for BASE.LXR
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    public void setLxr(String lxr) {
        this.lxr = lxr == null ? null : lxr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BASE.LXFS
     *
     * @return the value of BASE.LXFS
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    public String getLxfs() {
        return lxfs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BASE.LXFS
     *
     * @param lxfs the value for BASE.LXFS
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    public void setLxfs(String lxfs) {
        this.lxfs = lxfs == null ? null : lxfs.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BASE.DZ
     *
     * @return the value of BASE.DZ
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    public String getDz() {
        return dz;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BASE.DZ
     *
     * @param dz the value for BASE.DZ
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    public void setDz(String dz) {
        this.dz = dz == null ? null : dz.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BASE.PIC
     *
     * @return the value of BASE.PIC
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BASE.PIC
     *
     * @param pic the value for BASE.PIC
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BASE.MS
     *
     * @return the value of BASE.MS
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    public String getMs() {
        return ms;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BASE.MS
     *
     * @param ms the value for BASE.MS
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    public void setMs(String ms) {
        this.ms = ms == null ? null : ms.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BASE.Shape
     *
     * @return the value of BASE.Shape
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    public byte[] getShape() {
        return shape;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BASE.Shape
     *
     * @param shape the value for BASE.Shape
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    public void setShape(byte[] shape) {
        this.shape = shape;
    }
}