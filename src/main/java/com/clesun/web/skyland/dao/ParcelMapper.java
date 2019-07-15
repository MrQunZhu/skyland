package com.clesun.web.skyland.dao;

import com.clesun.web.skyland.entity.Parcel;
import com.clesun.web.skyland.entity.ParcelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParcelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PARCEL
     *
     * @mbggenerated Mon Jan 21 16:50:00 CST 2019
     */
    int countByExample(ParcelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PARCEL
     *
     * @mbggenerated Mon Jan 21 16:50:00 CST 2019
     */
    int deleteByExample(ParcelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PARCEL
     *
     * @mbggenerated Mon Jan 21 16:50:00 CST 2019
     */
    int deleteByPrimaryKey(Integer fid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PARCEL
     *
     * @mbggenerated Mon Jan 21 16:50:00 CST 2019
     */
    int insert(Parcel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PARCEL
     *
     * @mbggenerated Mon Jan 21 16:50:00 CST 2019
     */
    int insertSelective(Parcel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PARCEL
     *
     * @mbggenerated Mon Jan 21 16:50:00 CST 2019
     */
    List<Parcel> selectByExample(ParcelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PARCEL
     *
     * @mbggenerated Mon Jan 21 16:50:00 CST 2019
     */
    Parcel selectByPrimaryKey(Integer fid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PARCEL
     *
     * @mbggenerated Mon Jan 21 16:50:00 CST 2019
     */
    int updateByExampleSelective(@Param("record") Parcel record, @Param("example") ParcelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PARCEL
     *
     * @mbggenerated Mon Jan 21 16:50:00 CST 2019
     */
    int updateByExample(@Param("record") Parcel record, @Param("example") ParcelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PARCEL
     *
     * @mbggenerated Mon Jan 21 16:50:00 CST 2019
     */
    int updateByPrimaryKeySelective(Parcel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PARCEL
     *
     * @mbggenerated Mon Jan 21 16:50:00 CST 2019
     */
    int updateByPrimaryKey(Parcel record);
}