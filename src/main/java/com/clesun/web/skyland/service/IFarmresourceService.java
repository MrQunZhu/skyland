package com.clesun.web.skyland.service;

import com.clesun.web.skyland.entity.Farmresource;

/**
 * author: lixq
 * date: 2019/1/21
 * 描述: 农资(投入品)业务接口
 */
public interface IFarmresourceService extends ICoreService<Farmresource, Long> {
    /**
     * author lixq
     * date 2019/1/21
     * description 根据农资编号查询农资信息
     * @param inputCode 农资编号
     * @return
     */
    Farmresource getResourceByCode(String inputCode);
}
