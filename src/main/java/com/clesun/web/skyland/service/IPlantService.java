package com.clesun.web.skyland.service;

import com.clesun.web.skyland.entity.Plant;

/**
 * author: lixq
 * date: 2019/1/7
 * 描述:
 */
public interface IPlantService extends ICoreService<Plant,Long> {
    /**
     * author lixq
     * date 2019/1/7
     * description 根据唯一标识查询种植信息
     * @param
     * @return
     */
    Plant getPlantByBh(String bh);
}
