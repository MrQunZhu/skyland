package com.clesun.web.skyland.service;

import com.clesun.web.skyland.entity.ZhnyNsglXq;

import java.util.List;

/**
 * author: lixq
 * date: 2019/1/21
 * 描述: 农事记录业务接口
 */
public interface IZhnyNsglXqService extends ICoreService<ZhnyNsglXq, Long> {
    /**
     * author lixq
     * date 2019/1/21
     * description 根据种植记录查询农事记录
     * @param plantId 种植记录id
     * @return
     */
    List<ZhnyNsglXq> getFarmingByCode(Integer plantId);
}
