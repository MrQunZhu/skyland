package com.clesun.web.skyland.api;

import com.alibaba.druid.util.StringUtils;
import com.clesun.web.skyland.dto.ResultEntity;
import com.clesun.web.skyland.service.BatchImport;
import com.clesun.web.skyland.utils.ExcelImportUtils;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by clesun on 2017/11/13.
 */
@ApiIgnore
@RestController
@Api("excel导入测试")
public class ExcelApi {
    @Autowired
    private BatchImport batchImport;

    @PostMapping(value = "/batchImport")
    @ApiOperation(value = "上传表格", notes = "")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "applyMaterialEntity", value = "订单信息",
                    required = true, dataType = "ApplyMaterialEntity")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "success", response = ResultEntity.class)
    })
    public String batchImportUserKnowledge(@RequestParam(value="filename") MultipartFile file,
                                           HttpServletRequest request, HttpServletResponse response,
                                           HttpSession session) throws IOException {

        //判断文件是否为空
        if(file==null){
            session.setAttribute("msg","文件不能为空！");
            return "redirect:toUserKnowledgeImport";
        }

        //获取文件名
        String fileName=file.getOriginalFilename();

        //验证文件名是否合格
        if(!ExcelImportUtils.validateExcel(fileName)){
            session.setAttribute("msg","文件必须是excel格式！");
            return "文件必须是excel格式";
        }

        //进一步判断文件内容是否为空（即判断其大小是否为0或其名称是否为null）
        long size=file.getSize();
        if(StringUtils.isEmpty(fileName) || size==0){
            session.setAttribute("msg","文件不能为空！");
            return "文件不能为空！";
        }

        //批量导入
        String message = batchImport.batchImport(fileName,file);
        //session.setAttribute("msg",message);
        return message;
    }



}
