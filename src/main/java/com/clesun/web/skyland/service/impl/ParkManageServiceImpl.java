package com.clesun.web.skyland.service.impl;

import com.clesun.web.skyland.dao.ParkManageMapper;
import com.clesun.web.skyland.dto.AreaDto;
import com.clesun.web.skyland.dto.StatisticsEntity;
import com.clesun.web.skyland.service.IParkManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * author: lixq
 * date: 2019/1/8
 * 描述: 园区管理业务实现类
 */
@Service
public class ParkManageServiceImpl implements IParkManageService {
    @Autowired
    private ParkManageMapper manageMapper;

    @Override
    public StatisticsEntity getParcelStatistics() {
        StatisticsEntity entity = new StatisticsEntity();
        try {
            Double parceNum = manageMapper.getPracelNum();
            Double plantArea = manageMapper.getPlantArea();
            entity.setPracelNum(parceNum);
            entity.setPlantArea(plantArea);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entity;
    }

    @Override
    public List<AreaDto> getAreaLevelStatistics() {
        return manageMapper.getAreaLevelStatistics();
    }

    @Override
    public List<AreaDto> getAreaTypeStatistics() {
        return manageMapper.getAreaTypeStatistics();
    }

    @Override
    public List<AreaDto> getAreaDistribution() {
        return manageMapper.getAreaDistribution();
    }
}
