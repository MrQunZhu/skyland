package com.clesun.web.skyland.service.impl;

import com.clesun.web.skyland.dao.PlantMapper;
import com.clesun.web.skyland.entity.Plant;
import com.clesun.web.skyland.entity.PlantExample;
import com.clesun.web.skyland.exception.ServiceException;
import com.clesun.web.skyland.service.IPlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * author: lixq
 * date: 2019/1/7
 * 描述:
 */
@Service
public class PlantServiceImpl implements IPlantService {
    @Autowired
    private PlantMapper plantMapper;

    @Override
    public Plant getById(Long id) throws ServiceException {
        return null;
    }

    @Override
    public List<Plant> findAll() throws ServiceException {
        PlantExample example = new PlantExample();
        example.createCriteria();
        return plantMapper.selectByExample(example);
    }

    @Override
    public int deleteById(Long id) throws ServiceException {
        return 0;
    }

    @Override
    public int insert(Plant o) throws ServiceException {
        return 0;
    }

    @Override
    public int update(Plant o) throws ServiceException {
        return 0;
    }

    @Override
    public Plant getPlantByBh(String bh) {
        PlantExample example = new PlantExample();
        example.createCriteria().andBhEqualTo(bh);
        List<Plant> plants = plantMapper.selectByExample(example);
        if (null != plants && plants.size() > 0){
            return plants.get(0);
        }
        return null;
    }
}
