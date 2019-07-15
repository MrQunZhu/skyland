package com.clesun.web.skyland.api;

import com.clesun.web.skyland.dto.*;
import com.clesun.web.skyland.service.IBaseService;
import com.clesun.web.skyland.service.IParkManageService;
import com.clesun.web.skyland.service.IParcelService;
import com.clesun.web.skyland.utils.PageInfo;
import com.github.pagehelper.Page;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * author: lixq
 * date: 2019/1/8
 * 描述: 园区管理
 */
@RestController
@Api("园区管理")
public class ParkManageApi extends BaseApi {
    @Autowired
    private IParkManageService parkManageService;
    @Autowired
    private IBaseService baseService;
    @Autowired
    private IParcelService parcelService;

    private ResultEntity entity = null;
    /**
     * author lixq
     * date 2019/1/8
     * description 统计地块数量和种植面积
     * @param
     * @return
     */
    @RequestMapping(value = "/getBaseStatistics",method = {RequestMethod.GET},
            produces = {"application/json;charset=UTF-8"})
    @ApiOperation(value = "统计地块数量种植面积", notes = "统计当前园区地块数量和种植面积")
    @ApiResponses({
            @ApiResponse(code = 200, message = "返回值", response = ResultEntity.class),
            @ApiResponse(code = 201, message = "返回值中的data", response = StatisticsEntity.class)
    })
    public ResultEntity getBaseStatistics() {
        try {
            StatisticsEntity statistics = parkManageService.getParcelStatistics();
            entity = new ResultEntity(statistics);
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResultEntity(-1,"查询失败");
        }
        return entity;
    }

    /**
     * author lixq
     * date 2019/1/8
     * description 查询园区基本信息
     * @param
     * @return
     */
    @RequestMapping(value = "/getBaseInfo",method = {RequestMethod.GET},
            produces = {"application/json;charset=UTF-8"})
    @ApiOperation(value = "园区基本信息", notes = "查询园区基本信息")
    @ApiResponses({
            @ApiResponse(code = 200, message = "返回值", response = ResultEntity.class),
            @ApiResponse(code = 201, message = "返回值中的data", response = BaseEntity.class)
    })
    public ResultEntity getBaseInfo(){
        try {
            List<BaseEntity> bases = baseService.getAllBase();
            if (null != bases && bases.size() > 0){
                entity = new ResultEntity(bases.get(0));
            }
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResultEntity(-1,"查询失败");
        }
        return entity;
    }

    /**
     * author lixq
     * date 2019/1/8
     * description 获取地块列表数据
     * @param
     * @return
     */
    @RequestMapping(value = "/getParcels",method = {RequestMethod.GET},
            produces = {"application/json;charset=UTF-8"})
    @ApiOperation(value = "地块列表数据", notes = "所有地块数据信息")
    @ApiResponses({
            @ApiResponse(code = 200, message = "返回值", response = ResultEntity.class),
            @ApiResponse(code = 201, message = "返回值中的data", response = ParcelEntity.class)
    })
    public ResultEntity getParcels(){
        try {
            List<ParcelEntity> parcels = parcelService.findParcels();
            entity = new ResultEntity(parcels);
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResultEntity(-1,"查询失败");
        }
        return entity;
    }

    /**
     * author lixq
     * date 2019/1/9
     * description 地力等级
     * @param
     * @return
     */
    @RequestMapping(value = "/getParcelLevel",method = {RequestMethod.GET},
            produces = {"application/json;charset=UTF-8"})
    @ApiOperation(value = "地力等级饼图", notes = "不同地力等级耕地面积统计")
    @ApiResponses({
            @ApiResponse(code = 200, message = "返回值", response = ResultEntity.class),
            @ApiResponse(code = 201, message = "返回值中的data", response = AreaDto.class)
    })
    public ResultEntity getAreaLevel(){
        try {
            List<AreaDto> areaDto = parkManageService.getAreaLevelStatistics();
            entity = new ResultEntity(areaDto);
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResultEntity(-1,"查询失败");
        }
        return entity;
    }
    
    /**
     * author lixq
     * date 2019/1/9
     * description 地块类型统计
     * @param
     * @return
     */
    @RequestMapping(value = "/getParcelType",method = {RequestMethod.GET},
            produces = {"application/json;charset=UTF-8"})
    @ApiOperation(value = "地块类型统计", notes = "不同类型地块面积统计")
    @ApiResponses({
            @ApiResponse(code = 200, message = "返回值", response = ResultEntity.class),
            @ApiResponse(code = 201, message = "返回值中的data", response = AreaDto.class)
    })
    public ResultEntity getAreaType(){
        try {
            List<AreaDto> areaDto = parkManageService.getAreaTypeStatistics();
            entity = new ResultEntity(areaDto);
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResultEntity(-1,"查询失败");
        }
        return entity;
    }


    /**
     * author lixq
     * date 2019/1/9
     * description 耕地分布统计
     * @param
     * @return
     */
    @RequestMapping(value = "/getParcelDistribution",method = {RequestMethod.GET},
            produces = {"application/json;charset=UTF-8"})
    @ApiOperation(value = "耕地分布柱状图", notes = "根据责任单位统计耕地面积")
    @ApiResponses({
            @ApiResponse(code = 200, message = "返回值", response = ResultEntity.class),
            @ApiResponse(code = 201, message = "返回值中的data", response = AreaDto.class)
    })
    public ResultEntity getAreaDistribution(){
        try {
            List<AreaDto> areaDto = parkManageService.getAreaDistribution();
            entity = new ResultEntity(areaDto);
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResultEntity(-1,"查询失败");
        }
        return entity;
    }

    /**
     * author lixq
     * date 2019/1/18
     * description 分页查询地块信息
     * @param currentPageNum 页码
     * @param rowsOfPage 条数
     * @param areaType 地块类型
     * @param areaLevel 地力等级
     * @param personLiable 责任人
     * @param ownerUnit 责任单位
     * @return
     */
    @RequestMapping(value = "/getParcelPageData",method = {RequestMethod.GET},
            produces = {"application/json;charset=UTF-8"})
    @ApiOperation(value = "地块分页查询", notes = "分页查询地块数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "currentPageNum", value = "页码", required = true, paramType = "query", dataType = "Int"),
            @ApiImplicitParam(name = "rowsOfPage", value = "每页条数", required = true, paramType = "query", dataType = "Int"),
            @ApiImplicitParam(name = "areaType", value = "地块类型", required = false, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "areaLevel", value = "地力等级", required = false, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "personLiable", value = "责任人", required = false, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "ownerUnit", value = "责任单位", required = false, paramType = "query", dataType = "String")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "success", response = ResultEntity.class),
            @ApiResponse(code = 201, message = "success", response = PageInfo.class),
            @ApiResponse(code = 202, message = "success", response = ParcelEntity.class)
    })
    public ResultEntity getParcelPageData(Integer currentPageNum, Integer rowsOfPage,String areaType,
                                  String areaLevel, String personLiable,String ownerUnit) {
        try {
            Page<ParcelEntity> page = parcelService.findByPage(currentPageNum, rowsOfPage, areaType, areaLevel,
                    personLiable, ownerUnit);
            // 需要把Page包装成PageInfo对象才能序列化。该插件也默认实现了一个PageInfo
            PageInfo<ParcelEntity> pageInfo = new PageInfo<>(page);
            entity = new ResultEntity(pageInfo);
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResultEntity(-1,"查询失败");
        }

        return entity;
    }
}
