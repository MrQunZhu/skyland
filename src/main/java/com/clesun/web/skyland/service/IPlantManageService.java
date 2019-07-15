package com.clesun.web.skyland.service;

import com.clesun.web.skyland.dto.InputDto;
import com.clesun.web.skyland.dto.ParcelEntity;
import com.clesun.web.skyland.dto.PlantDto;
import com.clesun.web.skyland.entity.ZhnyNsgl;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * author: lixq
 * date: 2019/1/19
 * 描述: 种植管理业务接口
 */
public interface IPlantManageService {
    /**
     * author lixq
     * date 2019/1/19
     * description 统计不同类型作物种植面积
     * @param year 统计年份
     * @return
     */
    List<PlantDto> getPlantStatistic(Integer year);

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
     * date 2019/1/21
     * description
     * @param currentPageNum 页码
     * @param rowsOfPage 条数
     * @param parcelId 地块id
     * @param cropName 作物名称
     * @param year 年份
     * @return
     */
    Page<ZhnyNsgl> findPlantByPage(Integer currentPageNum, Integer rowsOfPage, String parcelId,
                                   String cropName, Integer year);

    /**
     * author lixq
     * date 2019/1/22
     * description 投入品信息自定义分页条件查询
     * @param currentPageNum 页码
     * @param rowsOfPage 条数
     * @param inputName 投入名称
     * @param manufacturer 生产厂商
     * @param year 年份
     * @param type 投入品类型
     * @return
     */
    Page<InputDto> findInputByPage(Integer currentPageNum, Integer rowsOfPage, String inputName,
                                   String manufacturer, Integer year, String type);
}
