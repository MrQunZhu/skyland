package com.clesun.web.skyland.dao;

import com.clesun.web.skyland.dto.EquipmentDto;

import java.util.List;

/**
 * author: lixq
 * date: 2019/1/8
 * 描述: 地面监测统计
 */
public interface GroundMonitoringMapper {
    /**
     * author lixq
     * date 2019/1/8
     * description 统计不同类型设备数量
     * @param
     * @return
     */
    List<EquipmentDto> getEquipmentNum();
}
