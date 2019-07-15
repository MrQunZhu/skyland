package com.clesun.web.skyland.service;

import com.clesun.web.skyland.entity.Equipment;

import java.util.List;

/**
 * author: lixq
 * date: 2019/1/12
 * 描述: 设备业务接口
 */
public interface IEquipmentService extends ICoreService<Equipment,Long> {
    /**
     * author lixq
     * date 2019/1/15
     * description
     * @param
     * @return
     */
    List<Equipment> getEquipmentByType(String type);
}
