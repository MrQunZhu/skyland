package com.clesun.web.skyland.api;

import com.clesun.web.skyland.dto.InputDto;
import com.clesun.web.skyland.dto.PlantDto;
import com.clesun.web.skyland.dto.ResultEntity;
import com.clesun.web.skyland.entity.Farmresource;
import com.clesun.web.skyland.entity.ZhnyNsgl;
import com.clesun.web.skyland.entity.ZhnyNsglXq;
import com.clesun.web.skyland.service.IFarmresourceService;
import com.clesun.web.skyland.service.IPlantManageService;
import com.clesun.web.skyland.service.IZhnyNsglService;
import com.clesun.web.skyland.service.IZhnyNsglXqService;
import com.clesun.web.skyland.utils.PageInfo;
import com.github.pagehelper.Page;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.util.*;
import java.util.stream.Collectors;

/**
 * author: lixq
 * date: 2019/1/19
 * 描述: 种植管理接口
 */
@RestController
@Api("种植管理")
public class PlantManageApi extends BaseApi {
    @Autowired
    private IPlantManageService plantManageService;
    @Autowired
    private IFarmresourceService farmresourceService;
    @Autowired
    private IZhnyNsglService zhnyNsglService;
    @Autowired
    private IZhnyNsglXqService zhnyNsglXqService;

    private ResultEntity entity = null;

    /**
     * author lixq
     * date 2019/1/19
     * description 统计作物种植面积和地块数量
     * @param year 年份
     * @return
     */
    @RequestMapping(value = "/getPlantStatistic",method = {RequestMethod.GET},
            produces = {"application/json;charset=UTF-8"})
    @ApiOperation(value = "物种植面、地块数量积统计", notes = "统计不同作物种植面积和地块数量")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "year", value = "年份", required = true, paramType = "query", dataType = "Int"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "返回值", response = ResultEntity.class),
            @ApiResponse(code = 201, message = "返回值中的data", response = PlantDto.class),
    })
    public ResultEntity getPlantStatistic(Integer year) {
        try {
            List<PlantDto> plants = plantManageService.getPlantStatistic(year);
            entity = new ResultEntity(plants);
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResultEntity(-1,"查询失败");
        }
        return entity;
    }

    /**
     * author lixq
     * date 2019/1/19
     * description 投入品统计
     * @param inputType 投入品类型
     * @return
     */
    @RequestMapping(value = "/getInputStatistic",method = {RequestMethod.GET},
            produces = {"application/json;charset=UTF-8"})
    @ApiOperation(value = "投入品统计", notes = "按年统计不同类型投入品使用量")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "inputType", value = "投入品类型", required = true, paramType = "query", dataType = "String")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "返回值", response = ResultEntity.class),
            @ApiResponse(code = 201, message = "返回值中的data", response = InputDto.class),
    })
    public ResultEntity getInputStatistic(String inputType) {
        try {
            List<InputDto> input = plantManageService.getInputStatistic(inputType);
            entity = new ResultEntity(input);
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResultEntity(-1,"查询失败");
        }
        return entity;
    }

    /**
     * author lixq
     * date 2019/1/21
     * description 根据编号查询投入品详细信息 （目前无用）
     * @param inputCode 投入品编号
     * @return
     */
    @ApiIgnore
    @RequestMapping(value = "/getInputByCode",method = {RequestMethod.GET},
            produces = {"application/json;charset=UTF-8"})
    @ApiOperation(value = "根据编号查询投入品详细信息", notes = "根据inputCode查询投入品基础信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "inputCode", value = "投入品编号", required = true, paramType = "query", dataType = "String")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "返回值", response = ResultEntity.class),
            @ApiResponse(code = 201, message = "返回值中的data", response = Farmresource.class),
    })
    public ResultEntity getInputByCode(String inputCode) {
        try {
            Farmresource farmresource = farmresourceService.getResourceByCode(inputCode);
            entity = new ResultEntity(farmresource);
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResultEntity(-1,"查询失败");
        }
        return entity;
    }

    /**
     * author lixq
     * date 2019/1/21
     * description 根据地块编号查询种植记录
     * @param parcelId 地块id
     * @return
     */
    @RequestMapping(value = "/getPlantByParcelCode",method = {RequestMethod.GET},
            produces = {"application/json;charset=UTF-8"})
    @ApiOperation(value = "根据地块id查询种植记录", notes = "根据parcelCode查询当前地块种植记录信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "parcelId", value = "地块编号", required = true, paramType = "query", dataType = "String")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "返回值", response = ResultEntity.class),
            @ApiResponse(code = 201, message = "返回值中的data", response = ZhnyNsgl.class),
    })
    public ResultEntity getPlantByParcelCode(String parcelId) {
        try {
            List<ZhnyNsgl> zhnyNsgls = zhnyNsglService.getPlantByParcelCode(parcelId);
            if (zhnyNsgls != null && zhnyNsgls.size() > 0){
                Map<String, List<ZhnyNsgl>> mapList = zhnyNsgls.stream().collect(Collectors.groupingBy(zhnynsgl -> {
                    String year = String.format("%tY", zhnynsgl.getJssj());
                    return year;
                }));
                //LinkedHashMap<String,List<ZhnyNsgl>> xMap=new LinkedHashMap<>();
                //mapList.entrySet().stream().sorted(Map.Entry.<String,List<ZhnyNsgl>>comparingByKey().reversed()).forEachOrdered(e -> xMap.put(e.getKey(), e.getValue()));
                //List<Map.Entry<String,List<ZhnyNsgl>>> list = new ArrayList<>(mapList.entrySet());
                entity = new ResultEntity(mapList);
            }
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResultEntity(-1,"查询失败");
        }
        return entity;
    }

    /**
     * author lixq
     * date 2019/1/21
     * description
     * @param plantId 种植记录id
     * @return
     */
    @RequestMapping(value = "/getFarmingByCode",method = {RequestMethod.GET},
            produces = {"application/json;charset=UTF-8"})
    @ApiOperation(value = "根据种植记录id查询农事记录", notes = "根据plantId查询当前种植记录对应的农事记录信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "plantId", value = "种植记录id", required = true, paramType = "query", dataType = "Int")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "返回值", response = ResultEntity.class),
            @ApiResponse(code = 201, message = "返回值中的data", response = ZhnyNsglXq.class),
    })
    public ResultEntity getFarmingByCode(Integer plantId) {
        try {
            List<ZhnyNsglXq> zhnyNsglXqs = zhnyNsglXqService.getFarmingByCode(plantId);
            entity = new ResultEntity(zhnyNsglXqs);
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResultEntity(-1,"查询失败");
        }
        return entity;
    }
    
    /**
     * author lixq
     * date 2019/1/21
     * description 种植记录分页查询
     * @param
     * @return
     */
    @RequestMapping(value = "/getPlantPageData",method = {RequestMethod.GET},
            produces = {"application/json;charset=UTF-8"})
    @ApiOperation(value = "种植记录分页查询", notes = "分页查询种植记录数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "currentPageNum", value = "页码", required = true, paramType = "query", dataType = "Int"),
            @ApiImplicitParam(name = "rowsOfPage", value = "每页条数", required = true, paramType = "query", dataType = "Int"),
            @ApiImplicitParam(name = "parcelId", value = "地块编号", required = false, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "cropName", value = "作物名称", required = false, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "year", value = "年份", required = true, paramType = "query", dataType = "Int"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "success", response = ResultEntity.class),
            @ApiResponse(code = 201, message = "success", response = PageInfo.class),
            @ApiResponse(code = 202, message = "success", response = ZhnyNsgl.class)
    })
    public ResultEntity getPlantPageData(Integer currentPageNum, Integer rowsOfPage,String parcelId,
                                  String cropName, Integer year) {
        try {
            Page<ZhnyNsgl> page = plantManageService.findPlantByPage(currentPageNum, rowsOfPage,
                    parcelId, cropName, year);
            // 需要把Page包装成PageInfo对象才能序列化。该插件也默认实现了一个PageInfo
            PageInfo<ZhnyNsgl> pageInfo = new PageInfo<>(page);
            entity = new ResultEntity(pageInfo);
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResultEntity(-1,"查询失败");
        }

        return entity;
    }

    /**
     * author lixq
     * date 2019/1/22
     * description 投入品记录分页查询
     * @param
     * @return
     */
    @RequestMapping(value = "/getInputPageData",method = {RequestMethod.GET},
            produces = {"application/json;charset=UTF-8"})
    @ApiOperation(value = "投入品记录分页查询", notes = "分页查询某年份投入品记录数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "currentPageNum", value = "页码", required = true, paramType = "query", dataType = "Int"),
            @ApiImplicitParam(name = "rowsOfPage", value = "每页条数", required = true, paramType = "query", dataType = "Int"),
            @ApiImplicitParam(name = "year", value = "年份", required = true, paramType = "query", dataType = "Int"),
            @ApiImplicitParam(name = "type", value = "投入品类型", required = true, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "inputName", value = "投入品名称", required = false, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "manufacturer", value = "生产厂商", required = false, paramType = "query", dataType = "String")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "success", response = ResultEntity.class),
            @ApiResponse(code = 201, message = "success", response = PageInfo.class),
            @ApiResponse(code = 202, message = "success", response = InputDto.class)
    })
    public ResultEntity getInputPageData(Integer currentPageNum, Integer rowsOfPage, Integer year, String type,
                                         String inputName,String manufacturer) {
        try {
            Page<InputDto> page = plantManageService.findInputByPage(currentPageNum, rowsOfPage,
                    inputName, manufacturer, year, type);
            // 需要把Page包装成PageInfo对象才能序列化。该插件也默认实现了一个PageInfo
            PageInfo<InputDto> pageInfo = new PageInfo<>(page);
            entity = new ResultEntity(pageInfo);
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResultEntity(-1,"查询失败");
        }

        return entity;
    }
}
