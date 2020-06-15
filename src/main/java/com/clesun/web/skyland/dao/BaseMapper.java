package com.clesun.web.skyland.dao;

import com.clesun.web.skyland.entity.Base;
import com.clesun.web.skyland.entity.BaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    int countByExample(BaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    int deleteByExample(BaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    int deleteByPrimaryKey(Integer objectid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    int insert(Base record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    int insertSelective(Base record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    List<Base> selectByExampleWithBLOBs(BaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    List<Base> selectByExample(BaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    Base selectByPrimaryKey(Integer objectid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    int updateByExampleSelective(@Param("record") Base record, @Param("example") BaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") Base record, @Param("example") BaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    int updateByExample(@Param("record") Base record, @Param("example") BaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    int updateByPrimaryKeySelective(Base record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(Base record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE
     *
     * @mbggenerated Mon Jan 07 18:51:04 CST 2019
     */
    int updateByPrimaryKey(Base record);
}