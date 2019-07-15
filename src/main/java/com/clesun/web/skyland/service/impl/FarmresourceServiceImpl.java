package com.clesun.web.skyland.service.impl;

import com.clesun.web.skyland.dao.FarmresourceMapper;
import com.clesun.web.skyland.entity.Farmresource;
import com.clesun.web.skyland.entity.FarmresourceExample;
import com.clesun.web.skyland.exception.ServiceException;
import com.clesun.web.skyland.service.IFarmresourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * author: lixq
 * date: 2019/1/21
 * 描述: 农资业务接口实现类
 */
@Service
public class FarmresourceServiceImpl implements IFarmresourceService {
    @Autowired
    private FarmresourceMapper farmresourceMapper;

    @Override
    public Farmresource getResourceByCode(String inputCode) {
        FarmresourceExample example = new FarmresourceExample();
        example.createCriteria().andBhEqualTo(inputCode);
        List<Farmresource> list = farmresourceMapper.selectByExample(example);
        if (list != null && list.size() > 0){
            return list.get(0);
        }
        return null;
    }

    @Override
    public Farmresource getById(Long id) throws ServiceException {
        return null;
    }

    @Override
    public List<Farmresource> findAll() throws ServiceException {
        return null;
    }

    @Override
    public int deleteById(Long id) throws ServiceException {
        return 0;
    }

    @Override
    public int insert(Farmresource o) throws ServiceException {
        return 0;
    }

    @Override
    public int update(Farmresource o) throws ServiceException {
        return 0;
    }
}
