package com.clesun.web.skyland.service;

import com.clesun.web.skyland.entity.ZhnyNsgl;

import java.util.List;

/**
 * author: lixq
 * date: 2019/1/21
 * 描述: 种植档案业务接口
 */
public interface IZhnyNsglService extends ICoreService<ZhnyNsgl, Long>{
    /**
     * author lixq
     * date 2019/1/21
     * description 根据地块编号查询种植档案信息
     * @param parcelCode 地块编号
     * @return
     */
    List<ZhnyNsgl> getPlantByParcelCode(String parcelCode);
}
