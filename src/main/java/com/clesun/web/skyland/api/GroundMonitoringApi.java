package com.clesun.web.skyland.api;

import com.clesun.web.skyland.dto.EquipmentDto;
import com.clesun.web.skyland.dto.ResultEntity;
import com.clesun.web.skyland.entity.Equipment;
import com.clesun.web.skyland.service.IEquipmentService;
import com.clesun.web.skyland.service.IGroundMonitoringService;
import com.clesun.web.skyland.utils.HttpUtils;
import io.swagger.annotations.*;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * author: lixq
 * date: 2019/1/12
 * 描述: 地面监测
 */
@RestController
@Api("地面监测")
public class GroundMonitoringApi extends BaseApi {
    @Autowired
    private IGroundMonitoringService monitoringService;

    @Autowired
    private IEquipmentService equipmentService;

    private ResultEntity entity = null;
    /**
     * author lixq
     * date 2019/1/8
     * description 统计不同类型设备数量
     * @param
     * @return
     */
    @RequestMapping(value = "/statsEquipmentType",method = {RequestMethod.GET},
            produces = {"application/json;charset=UTF-8"})
    @ApiOperation(value = "统计设备数量", notes = "统计不同设备数量")
    @ApiResponses({
            @ApiResponse(code = 200, message = "返回值", response = ResultEntity.class),
            @ApiResponse(code = 201, message = "返回值中的data", response = EquipmentDto.class)
    })
    public ResultEntity getBaseStatistics() {
        try {
            List<EquipmentDto> equipmentDto = monitoringService.getEquipmentNum();
            entity = new ResultEntity(equipmentDto);
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResultEntity(-1,"查询失败");
        }
        return entity;
    }

    /**
     * author lixq
     * date 2019/1/12
     * description 查询视频设备
     * @param
     * @return
     */
    @RequestMapping(value = "/getVideoEquipment",method = {RequestMethod.GET},
            produces = {"application/json;charset=UTF-8"})
    @ApiOperation(value = "查询视频设备", notes = "查询所有视频设备")
    @ApiResponses({
            @ApiResponse(code = 200, message = "返回值", response = ResultEntity.class),
            @ApiResponse(code = 201, message = "返回值中的data", response = Equipment.class)
    })
    public ResultEntity getVideoEquipment() {
        try {
            List<Equipment> equipment = equipmentService.getEquipmentByType("摄像头");
            entity = new ResultEntity(equipment);
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResultEntity(-1,"查询失败");
        }
        return entity;
    }
    
    /**
     * author lixq
     * date 2019/1/15
     * description 查询采集仪设备
     * @param
     * @return
     */
    @RequestMapping(value = "/getSensorEquipment",method = {RequestMethod.GET},
            produces = {"application/json;charset=UTF-8"})
    @ApiOperation(value = "查询采集仪设备", notes = "查询所有传感器采集仪设备")
    @ApiResponses({
            @ApiResponse(code = 200, message = "返回值", response = ResultEntity.class),
            @ApiResponse(code = 201, message = "返回值中的data", response = Equipment.class)
    })
    public ResultEntity getSensorEquipment() {
        try {
            List<Equipment> equipment = equipmentService.getEquipmentByType("传感器");
            entity = new ResultEntity(equipment);
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResultEntity(-1,"查询失败");
        }
        return entity;
    }

    /**
     * author lixq
     * date 2019/1/15
     * description 冠层检测站数据
     * @param startTime 开始时间
     * @param endTime 结束时间
     * @return
     */
    @RequestMapping(value = "/getCanopyEquipmentData",method = {RequestMethod.GET},
            produces = {"application/json;charset=UTF-8"})
    @ApiOperation(value = "冠层检测站数据", notes = "查询冠层检测站数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "startTime", value = "开始时间", required = true, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "endTime", value = "结束时间", required = true, paramType = "query", dataType = "String"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "返回值", response = ResultEntity.class),
    })
    public ResultEntity getCanopyEquipmentData(String startTime, String endTime) {
        try {
            Map<String, String> headers = new HashMap<>();
            Map<String, String> querys = new HashMap<>();
            headers.put("Content-Type","application/json;charset=UTF-8");
            querys.put("user_name","sun");
            querys.put("user_key","sun");
            querys.put("imei","866289031744180");
            querys.put("start_time",startTime);
            querys.put("stop_time",endTime);
            querys.put("output","json");
            HttpResponse farmResponse = HttpUtils.doGet("http://47.93.16.19/EM50/client_data/",
                    "client_data.php","",headers,querys);
            HttpEntity httpEntity = farmResponse.getEntity();
            String result = IOUtils.toString(httpEntity.getContent(),"UTF-8");
            System.out.println(result);
            JSONObject jsonObject = JSONObject.fromObject(result);
            entity = new ResultEntity(jsonObject.get("data"));
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResultEntity(-1,"查询失败");
        }
        return entity;
    }

    /**
     * author lixq
     * date 2019/1/15
     * description 设置采集仪报警状态
     * @param fid 设备标识
     * @param type 报警状态
     * @return
     */
    @RequestMapping(value = "/updateAlarmType",method = {RequestMethod.PUT},
            produces = {"application/json;charset=UTF-8"})
    @ApiOperation(value = "设置采集仪报警状态", notes = "修改传感器采集仪报警状态")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "fid", value = "设备标识,多个设备标识用,隔开", required = true, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "type", value = "报警类型0:不报警1:报警", required = true, paramType = "query", dataType = "Int"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "返回值", response = ResultEntity.class),
    })
    public ResultEntity updateEquipmentAlarmType(String fid, Integer type) {
        try {
            int result = 0;
            Equipment equipment = new Equipment();
            String []fids  = fid.split(",");
            if (!"".equals(fid) && fids.length >0){
                for (int i = 0; i < fids.length; i++) {
                    equipment.setFid(Integer.valueOf(fids[i]));
                    equipment.setAlarmstatus(type);
                    result += equipmentService.update(equipment);
                }
            }
            if (result > 0){
                entity = new ResultEntity(0,"设置成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResultEntity(-1,"设置失败");
        }
        return entity;
    }

    /**
     * author lixq
     * date 2019/1/15
     * description 查询采集仪报警数据
     * @param startTime 开始时间
     * @param endTime 结束时间
     * @return
     */
    @RequestMapping(value = "/getAlarmData",method = {RequestMethod.GET},
            produces = {"application/json;charset=UTF-8"})
    @ApiOperation(value = "获取报警数据", notes = "查询采集仪报警数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "startTime", value = "开始时间", required = false, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "endTime", value = "结束时间", required = false, paramType = "query", dataType = "String"),
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "返回值", response = ResultEntity.class),
    })
    public ResultEntity getAlarmData(String startTime, String endTime) {
        try {
            Map<String, String> headers = new HashMap<>(16);
            Map<String, String> querys = new HashMap<>(16);
            headers.put("Content-Type","application/json;charset=UTF-8");
            //方法名
            querys.put("method","getSystemNoticeList");
            //农用通登录账户id
            querys.put("operatorid","740");//661
            //每页条数
            querys.put("pageSize","1000");
            //页数
            querys.put("pageNumber","1");

            if ("".equals(startTime)){
                startTime = LocalDate.now().toString() + " 00:00:00";
            }
            if ("".equals(endTime)){
                endTime = LocalDate.now().toString() + " 23:59:59";
            }
            //数据起始时间
            querys.put("startTime",startTime);
            //数据结束时间
            querys.put("endTime",endTime);
            HttpResponse farmResponse = HttpUtils.doGet("http://api.nongyongtong.com:8081/",
                    "qfls/api","",headers,querys);
            HttpEntity httpEntity = farmResponse.getEntity();
            String result = IOUtils.toString(httpEntity.getContent(),"GBK");
            System.out.println(result);
            JSONObject jsonObject = JSONObject.fromObject(result);
            JSONArray jsonArray = jsonObject.getJSONArray("notice");
            String [] addrs = {"60817563","60817559","60817560"};
            if (jsonArray != null && jsonArray.size() > 0){
                for (int i = 0; i < jsonArray.size(); i++) {
                    JSONObject object = jsonArray.getJSONObject(i);
                    String content = object.get("content").toString();
                    String addr = content.substring(content.indexOf("(") + 1, content.indexOf(")"));
                    if (i <= 2){
                        object.put("addr",addrs[i]);
                    }else {
                        object.put("addr",addr);
                    }
                }
            }else {

            }
            entity = new ResultEntity(jsonArray);
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResultEntity(-1,"查询失败");
        }
        return entity;
    }
}
