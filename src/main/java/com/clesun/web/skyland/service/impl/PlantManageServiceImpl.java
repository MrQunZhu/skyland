package com.clesun.web.skyland.service.impl;

import com.clesun.web.skyland.dao.PlantManageMapper;
import com.clesun.web.skyland.dto.InputDto;
import com.clesun.web.skyland.dto.ParcelEntity;
import com.clesun.web.skyland.dto.PlantDto;
import com.clesun.web.skyland.entity.ZhnyNsgl;
import com.clesun.web.skyland.service.IPlantManageService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * author: lixq
 * date: 2019/1/19
 * 描述: 种植管理业务实现类
 */
@Service
public class PlantManageServiceImpl implements IPlantManageService {
    @Autowired
    private PlantManageMapper plantManageMapper;

    @Override
    public List<PlantDto> getPlantStatistic(Integer year) {
        return plantManageMapper.getPlantStatistic(year);
    }

    @Override
    public List<InputDto> getInputStatistic(String inputType) {
        return plantManageMapper.getInputStatistic(inputType);
    }

    @Override
    public Page<ZhnyNsgl> findPlantByPage(Integer currentPageNum, Integer rowsOfPage, String parcelId, String cropName, Integer year) {
        PageHelper.startPage(currentPageNum, rowsOfPage);
        Page page = plantManageMapper.findPlantByPage(parcelId, cropName, year);
        return page;
    }

    @Override
    public Page<InputDto> findInputByPage(Integer currentPageNum, Integer rowsOfPage, String inputName,
                                          String manufacturer,Integer year,String type) {
        PageHelper.startPage(currentPageNum, rowsOfPage);
        Page page = plantManageMapper.findInputByPage(inputName, manufacturer, year, type);
        return page;
    }
}
