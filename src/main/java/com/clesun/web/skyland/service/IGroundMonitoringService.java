package com.clesun.web.skyland.service;

import com.clesun.web.skyland.dto.EquipmentDto;

import java.util.List;

/**
 * author: lixq
 * date: 2019/1/8
 * 描述: 地面监测业务层接口
 */
public interface IGroundMonitoringService {
    /**
     * author lixq
     * date 2019/1/8
     * description 统计不同类型设备数量
     * @param
     * @return
     */
    List<EquipmentDto> getEquipmentNum();
}
