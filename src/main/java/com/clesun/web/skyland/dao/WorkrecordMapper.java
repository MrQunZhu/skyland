package com.clesun.web.skyland.dao;

import com.clesun.web.skyland.entity.Workrecord;
import com.clesun.web.skyland.entity.WorkrecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkrecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WORKRECORD
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    int countByExample(WorkrecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WORKRECORD
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    int deleteByExample(WorkrecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WORKRECORD
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    int insert(Workrecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WORKRECORD
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    int insertSelective(Workrecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WORKRECORD
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    List<Workrecord> selectByExample(WorkrecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WORKRECORD
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    int updateByExampleSelective(@Param("record") Workrecord record, @Param("example") WorkrecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WORKRECORD
     *
     * @mbggenerated Fri Jan 18 14:46:02 CST 2019
     */
    int updateByExample(@Param("record") Workrecord record, @Param("example") WorkrecordExample example);
}