package com.clesun.web.skyland.service.impl;

import com.clesun.web.skyland.dao.ZhnyNsglXqMapper;
import com.clesun.web.skyland.entity.ZhnyNsglXq;
import com.clesun.web.skyland.entity.ZhnyNsglXqExample;
import com.clesun.web.skyland.exception.ServiceException;
import com.clesun.web.skyland.service.IZhnyNsglXqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * author: lixq
 * date: 2019/1/21
 * 描述: 农事记录业务实现类
 */
@Service
public class ZhnyNsglXqServiceImpl implements IZhnyNsglXqService {
    @Autowired
    private ZhnyNsglXqMapper zhnyNsglXqMapper;

    @Override
    public List<ZhnyNsglXq> getFarmingByCode(Integer plantId) {
        ZhnyNsglXqExample example = new ZhnyNsglXqExample();
        example.createCriteria().andNsglIdEqualTo(plantId);
        example.setOrderByClause("CZJSSJ");
        return zhnyNsglXqMapper.selectByExample(example);
    }

    @Override
    public ZhnyNsglXq getById(Long id) throws ServiceException {
        return null;
    }

    @Override
    public List<ZhnyNsglXq> findAll() throws ServiceException {
        return null;
    }

    @Override
    public int deleteById(Long id) throws ServiceException {
        return 0;
    }

    @Override
    public int insert(ZhnyNsglXq o) throws ServiceException {
        return 0;
    }

    @Override
    public int update(ZhnyNsglXq o) throws ServiceException {
        return 0;
    }
}
