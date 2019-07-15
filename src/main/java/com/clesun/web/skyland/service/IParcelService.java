package com.clesun.web.skyland.service;

import com.clesun.web.skyland.dto.BaseEntity;
import com.clesun.web.skyland.dto.ParcelEntity;
import com.clesun.web.skyland.entity.Parcel;
import com.github.pagehelper.Page;

import java.util.List;

/**
 * author: lixq
 * date: 2019/1/8
 * 描述: 地块业务接口
 */
public interface IParcelService extends ICoreService<Parcel,Long>{

    /**
     * author lixq
     * date 2019/1/8
     * description 查询地块数据（处理空间数据）
     * @param
     * @return
     */
    List<ParcelEntity> findParcels();

    /**
     * author lixq
     * date 2019/1/18
     * description 分页条件查询地块信息
     * @param currentPageNum 页码
     * @param rowsOfPage 条数
     * @param areaType 地块类型
     * @param areaLevel 地力等级
     * @param personLiable 责任人
     * @param ownerUnit 责任单位
     * @return
     */
    Page<ParcelEntity> findByPage(Integer currentPageNum, Integer rowsOfPage, String areaType,
                                String areaLevel, String personLiable, String ownerUnit);
}
