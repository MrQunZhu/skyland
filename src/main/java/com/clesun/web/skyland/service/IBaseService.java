package com.clesun.web.skyland.service;

import com.clesun.web.skyland.dto.BaseEntity;
import com.clesun.web.skyland.entity.Base;

import java.util.List;

/**
 * author: lixq
 * date: 2019/1/7
 * 描述:
 */
public interface IBaseService extends ICoreService<Base,Long> {
    /**
     * author lixq
     * date 2019/1/8
     * description 自定义查询所有基地信息
     * @param
     * @return
     */
    List<BaseEntity> getAllBase();


}
