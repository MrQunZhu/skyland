package com.clesun.web.skyland.dao;

import com.clesun.web.skyland.dto.InputDto;
import com.clesun.web.skyland.dto.ParcelEntity;
import com.clesun.web.skyland.dto.PlantDto;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * author: lixq
 * date: 2019/1/19
 * 描述: 种植管理统计
 */
public interface PlantManageMapper {
    /**
     * author lixq
     * date 2019/1/19
     * description 统计不同类型作物种植面积
     * @param year 统计年份
     * @return
     */
    List<PlantDto> getPlantStatistic(@Param("year") Integer year);

    /**
     * author lixq
     * date 2019/1/21
     * description
     * @param parcelId 地块id
     * @param cropName 作物名称
     * @param year 年份
     * @return
     */
    Page<ParcelEntity> findPlantByPage(@Param("parcelId") String parcelId, @Param("cropName") String cropName,
                                       @Param("year") Integer year);

    /**
     * author lixq
     * date 2019/1/19
     * description 统计不同类型投入品的使用量
     * @param inputType
     * @return
     */
    List<InputDto> getInputStatistic(String inputType);
    
    /**
     * author lixq
     * date 2019/1/22
     * description 投入品信息自定义分页条件查询
     * @param inputName 投入名称
     * @param manufacturer 生产厂商
     * @param year 年份
     * @param type 投入品类型
     * @return
     */
    Page<InputDto> findInputByPage(@Param("inputName") String inputName, @Param("manufacturer") String manufacturer,
                                   @Param("year") Integer year, @Param("type") String type);
}
