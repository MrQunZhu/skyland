package com.clesun.web.skyland.dao;

import com.clesun.web.skyland.entity.Resourcerecord;
import com.clesun.web.skyland.entity.ResourcerecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResourcerecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RESOURCERECORD
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    int countByExample(ResourcerecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RESOURCERECORD
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    int deleteByExample(ResourcerecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RESOURCERECORD
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    int insert(Resourcerecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RESOURCERECORD
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    int insertSelective(Resourcerecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RESOURCERECORD
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    List<Resourcerecord> selectByExample(ResourcerecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RESOURCERECORD
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    int updateByExampleSelective(@Param("record") Resourcerecord record, @Param("example") ResourcerecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RESOURCERECORD
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    int updateByExample(@Param("record") Resourcerecord record, @Param("example") ResourcerecordExample example);
}