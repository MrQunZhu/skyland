package com.clesun.web.skyland.dao;

import com.clesun.web.skyland.dto.BaseEntity;
import com.clesun.web.skyland.dto.ParcelEntity;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * author: lixq
 * date: 2019/1/8
 * 描述:
 */
public interface BaseEntityMapper {
    /**
     * author lixq
     * date 2019/1/8
     * description 查询园区信息
     * @param
     * @return
     */
    List<BaseEntity> getBase();

    /**
     * author lixq
     * date 2019/1/8
     * description 查询地块信息
     * @param
     * @return
     */
    List<ParcelEntity> getParcels();

    /**
     * author lixq
     * date 2019/1/18
     * description 自定义分页条件查询
     * @param
     * @return
     */
    Page<ParcelEntity> findByPage(@Param("areaType") String areaType,@Param("areaLevel") String areaLevel,
                                  @Param("personLiable") String personLiable,@Param("ownerUnit") String ownerUnit);
    
}
