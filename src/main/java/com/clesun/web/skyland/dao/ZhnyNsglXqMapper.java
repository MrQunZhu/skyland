package com.clesun.web.skyland.dao;

import com.clesun.web.skyland.entity.ZhnyNsglXq;
import com.clesun.web.skyland.entity.ZhnyNsglXqExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZhnyNsglXqMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZHNY_NSGL_XQ
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    int countByExample(ZhnyNsglXqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZHNY_NSGL_XQ
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    int deleteByExample(ZhnyNsglXqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZHNY_NSGL_XQ
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZHNY_NSGL_XQ
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    int insert(ZhnyNsglXq record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZHNY_NSGL_XQ
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    int insertSelective(ZhnyNsglXq record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZHNY_NSGL_XQ
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    List<ZhnyNsglXq> selectByExample(ZhnyNsglXqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZHNY_NSGL_XQ
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    ZhnyNsglXq selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZHNY_NSGL_XQ
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    int updateByExampleSelective(@Param("record") ZhnyNsglXq record, @Param("example") ZhnyNsglXqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZHNY_NSGL_XQ
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    int updateByExample(@Param("record") ZhnyNsglXq record, @Param("example") ZhnyNsglXqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZHNY_NSGL_XQ
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    int updateByPrimaryKeySelective(ZhnyNsglXq record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZHNY_NSGL_XQ
     *
     * @mbggenerated Mon Jan 21 10:33:42 CST 2019
     */
    int updateByPrimaryKey(ZhnyNsglXq record);
}