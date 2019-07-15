package com.clesun.web.skyland.api;

import com.clesun.web.skyland.dto.BaseEntity;
import com.clesun.web.skyland.dto.ResultEntity;
import com.clesun.web.skyland.service.IBaseService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

/**
 * author: lixq
 * date: 2019/1/7
 * 描述: 基地信息
 */
@ApiIgnore
@RestController
@Api("基地数据接口")
public class BaseInfoApi extends BaseApi {
    @Autowired
    private IBaseService baseService;
    private ResultEntity entity = null;


    @RequestMapping(value = "/getBases",method = {RequestMethod.GET},
            produces = {"application/json;charset=UTF-8"})
    @ApiOperation(value = "查询基地信息", notes = "查询基地信息接口")
    @ApiResponses({
            @ApiResponse(code = 200, message = "success", response = ResultEntity.class)
    })
    public ResultEntity getPlants() throws Exception {
        try {
            List<BaseEntity> list = baseService.getAllBase();
            entity = new ResultEntity(list);
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResultEntity(-1,"查询失败");
        }

        return entity;
    }
}
