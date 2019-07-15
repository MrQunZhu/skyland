package com.clesun.web.skyland.service.impl;

import com.clesun.web.skyland.dao.ZhnyNsglMapper;
import com.clesun.web.skyland.entity.ZhnyNsgl;
import com.clesun.web.skyland.entity.ZhnyNsglExample;
import com.clesun.web.skyland.exception.ServiceException;
import com.clesun.web.skyland.service.IZhnyNsglService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * author: lixq
 * date: 2019/1/21
 * 描述: 种植档案接口实现类
 */
@Service
public class ZhnyNsglServiceImpl implements IZhnyNsglService {
    @Autowired
    private ZhnyNsglMapper nsglMapper;
    @Override
    public List<ZhnyNsgl> getPlantByParcelCode(String parcelCode) {
        ZhnyNsglExample example = new ZhnyNsglExample();
        example.createCriteria().andDkidEqualTo(parcelCode);
        example.setOrderByClause("JSSJ desc");
        return nsglMapper.selectByExample(example);
    }

    @Override
    public ZhnyNsgl getById(Long id) throws ServiceException {
        return null;
    }

    @Override
    public List<ZhnyNsgl> findAll() throws ServiceException {
        return null;
    }

    @Override
    public int deleteById(Long id) throws ServiceException {
        return 0;
    }

    @Override
    public int insert(ZhnyNsgl o) throws ServiceException {
        return 0;
    }

    @Override
    public int update(ZhnyNsgl o) throws ServiceException {
        return 0;
    }
}
