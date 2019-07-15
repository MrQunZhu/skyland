package com.clesun.web.skyland.service.impl;

import com.clesun.web.skyland.dao.EquipmentMapper;
import com.clesun.web.skyland.entity.Equipment;
import com.clesun.web.skyland.entity.EquipmentExample;
import com.clesun.web.skyland.exception.ServiceException;
import com.clesun.web.skyland.service.IEquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * author: lixq
 * date: 2019/1/12
 * 描述:
 */
@Service
public class EquipemntServiceImpl implements IEquipmentService {
    @Autowired
    private EquipmentMapper equipmentMapper;

    @Override
    public Equipment getById(Long id) throws ServiceException {
        return null;
    }

    @Override
    public List<Equipment> findAll() throws ServiceException {
        EquipmentExample example = new EquipmentExample();
        example.createCriteria().andLxEqualTo("摄像头");
        return equipmentMapper.selectByExample(example);
    }

    @Override
    public int deleteById(Long id) throws ServiceException {
        return 0;
    }

    @Override
    public int insert(Equipment o) throws ServiceException {
        return 0;
    }

    @Override
    public int update(Equipment o) throws ServiceException {
        EquipmentExample example = new EquipmentExample();
        example.createCriteria().andFidEqualTo(o.getFid());
        return equipmentMapper.updateByExampleSelective(o,example);
    }

    @Override
    public List<Equipment> getEquipmentByType(String type) {
        EquipmentExample example = new EquipmentExample();
        example.createCriteria().andLxEqualTo(type);
        return equipmentMapper.selectByExample(example);
    }
}
