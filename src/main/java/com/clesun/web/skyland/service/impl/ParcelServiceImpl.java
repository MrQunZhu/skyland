package com.clesun.web.skyland.service.impl;

import com.clesun.web.skyland.dao.BaseEntityMapper;
import com.clesun.web.skyland.dao.ParcelMapper;
import com.clesun.web.skyland.dto.BaseEntity;
import com.clesun.web.skyland.dto.ParcelEntity;
import com.clesun.web.skyland.entity.BaseExample;
import com.clesun.web.skyland.entity.Parcel;
import com.clesun.web.skyland.entity.ParcelExample;
import com.clesun.web.skyland.exception.ServiceException;
import com.clesun.web.skyland.service.IParcelService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * author: lixq
 * date: 2019/1/8
 * 描述: 地块业务实现类
 */
@Service
public class ParcelServiceImpl implements IParcelService {
    @Autowired
    private ParcelMapper parcelMapper;
    @Autowired
    private BaseEntityMapper baseEntityMapper;
    @Override
    public Parcel getById(Long id) throws ServiceException {
        return null;
    }

    @Override
    public List<Parcel> findAll() throws ServiceException {
        ParcelExample example = new ParcelExample();
        return parcelMapper.selectByExample(example);
    }

    @Override
    public int deleteById(Long id) throws ServiceException {
        return 0;
    }

    @Override
    public int insert(Parcel o) throws ServiceException {
        return 0;
    }

    @Override
    public int update(Parcel o) throws ServiceException {
        return 0;
    }

    @Override
    public List<ParcelEntity> findParcels() {
        return baseEntityMapper.getParcels();
    }

    @Override
    public Page<ParcelEntity> findByPage(Integer currentPageNum, Integer rowsOfPage, String areaType,
                                       String areaLevel, String personLiable, String ownerUnit) {
        PageHelper.startPage(currentPageNum, rowsOfPage);
        Page page = baseEntityMapper.findByPage(areaType, areaLevel, personLiable, ownerUnit);
        return page;
    }
}
