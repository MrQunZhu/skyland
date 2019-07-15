package com.clesun.web.skyland.dao;

import com.clesun.web.skyland.dto.AreaDto;

import java.util.List;

/**
 * author: lixq
 * date: 2019/1/8
 * 描述: 园区管理统计
 */
public interface ParkManageMapper {
    /**
     * author lixq
     * date 2019/1/8
     * description 统计地块数量
     * @param
     * @return
     */
    Double getPracelNum();

    /**
     * author lixq
     * date 2019/1/8
     * description 统计种植面积
     * @param
     * @return
     */
    Double getPlantArea();

    /**
     * author lixq
     * date 2019/1/8
     * description 统计地力等级
     * @param
     * @return
     */
    List<AreaDto> getAreaLevelStatistics();

    /**
     * author lixq
     * date 2019/1/8
     * description 统计地块类型
     * @param
     * @return
     */
    List<AreaDto> getAreaTypeStatistics();

    /**
     * author lixq
     * date 2019/1/9
     * description 耕地分布统计
     * @param
     * @return
     */
    List<AreaDto> getAreaDistribution();
}
