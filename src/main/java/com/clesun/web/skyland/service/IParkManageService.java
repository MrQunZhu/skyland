package com.clesun.web.skyland.service;

import com.clesun.web.skyland.dto.AreaDto;
import com.clesun.web.skyland.dto.StatisticsEntity;

import java.util.List;

/**
 * author: lixq
 * date: 2019/1/8
 * 描述: 园区管理业务层接口
 */
public interface IParkManageService {
    /**
     * author lixq
     * date 2019/1/8
     * description 获取地块数量种植面积统计数据
     * @param
     * @return
     */
    StatisticsEntity getParcelStatistics();

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
