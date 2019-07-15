package com.clesun.web.skyland.service.impl;

import com.clesun.web.skyland.dao.GroundMonitoringMapper;
import com.clesun.web.skyland.dto.EquipmentDto;
import com.clesun.web.skyland.service.IGroundMonitoringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * author: lixq
 * date: 2019/1/12
 * 描述: 地面监测业务层接口实现类
 */
@Service
public class GroundMonitoringServiceImpl implements IGroundMonitoringService {
    @Autowired
    private GroundMonitoringMapper monitoringMapper;

    @Override
    public List<EquipmentDto> getEquipmentNum() {
        try {
            return  monitoringMapper.getEquipmentNum();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
