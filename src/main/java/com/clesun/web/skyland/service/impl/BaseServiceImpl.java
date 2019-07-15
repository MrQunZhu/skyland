package com.clesun.web.skyland.service.impl;

import com.clesun.web.skyland.dao.BaseEntityMapper;
import com.clesun.web.skyland.dao.BaseMapper;
import com.clesun.web.skyland.dto.BaseEntity;
import com.clesun.web.skyland.entity.Base;
import com.clesun.web.skyland.entity.BaseExample;
import com.clesun.web.skyland.exception.ServiceException;
import com.clesun.web.skyland.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * author: lixq
 * date: 2019/1/7
 * 描述:
 */
@Service
public class BaseServiceImpl implements IBaseService {
    @Autowired
    private BaseMapper baseMapper;

    @Autowired
    private BaseEntityMapper entityMapper;

    @Override
    public Base getById(Long id) throws ServiceException {
        return null;
    }

    @Override
    public List<Base> findAll() throws ServiceException {
        BaseExample example = new BaseExample();
        List<Base> bases = baseMapper.selectByExampleWithBLOBs(example);
        return bases;
    }

    @Override
    public int deleteById(Long id) throws ServiceException {
        return 0;
    }

    @Override
    public int insert(Base o) throws ServiceException {
        return 0;
    }

    @Override
    public int update(Base o) throws ServiceException {
        return 0;
    }

    @Override
    public List<BaseEntity> getAllBase() {
        List<BaseEntity> list = entityMapper.getBase();
        return list;
    }

}
