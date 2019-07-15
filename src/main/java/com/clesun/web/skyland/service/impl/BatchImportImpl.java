package com.clesun.web.skyland.service.impl;

import com.alibaba.druid.util.StringUtils;
import com.clesun.web.skyland.service.BatchImport;
import com.clesun.web.skyland.utils.ExcelImportUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by clesun on 2017/11/13.
 */
@Service
public class BatchImportImpl implements BatchImport {
    /**
     * 上传excel文件到临时目录后并开始解析
     *
     * @param fileName
     * @param mfile
     * @return
     * @author lxq
     * @DATE 2017/11/13
     */
    @Override
    public String batchImport(String fileName, MultipartFile mfile) {
        File uploadDir = new  File("E:\\fileupload");
        //创建一个目录 （它的路径名由当前 File 对象指定，包括任一必须的父路径。）
        if (!uploadDir.exists()) {
            uploadDir.mkdirs();
        }
        //新建一个文件
        File tempFile = new File("E:\\fileupload\\" + System.currentTimeMillis() + ".xlsx");
        //初始化输入流
        InputStream is = null;
        try{
            //将上传的文件写入新建的文件中
            mfile.transferTo(tempFile);

            //根据新建的文件实例化输入流
            is = new FileInputStream(tempFile);

            //根据版本选择创建Workbook的方式
            Workbook wb = null;
            //根据文件名判断文件是2003版本还是2007版本
            if(ExcelImportUtils.isExcel2007(fileName)){
                wb = new XSSFWorkbook(is);
            }else{
                wb = new HSSFWorkbook(is);
            }
            //根据excel里面的内容读取知识库信息
            return readExcelValue(wb,tempFile);
        }catch(Exception e){
            e.printStackTrace();
        } finally{
            if(is !=null)
            {
                try{
                    is.close();
                }catch(IOException e){
                    is = null;
                    e.printStackTrace();
                }
            }
        }
        return "导入出错！请检查数据格式！";
    }

    /**
     * 解析Excel里面的数据
     *
     * @param wb
     * @param tempFile
     * @return
     * @author lxq
     * @DATE 2017/11/13
     */
    @Override
    public String readExcelValue(Workbook wb, File tempFile) {
        //错误信息接收器
        String errorMsg = "";
        String result = "";
        String br = "<br/>";
        //得到Excel shell个数
        int sheets = wb.getNumberOfSheets();
        if(sheets>0){
            for (int i = 0; i < sheets; i++) {
                System.out.print("第"+(i+1)+"页");
                if(i>0){
                    result += br+"第"+(i+1)+"页内容:";
                }else {
                    result += "第"+(i+1)+"页内容:";
                }
                //得到第一个shell
                Sheet sheet=wb.getSheetAt(i);
                //得到Excel的行数
                int totalRows=sheet.getPhysicalNumberOfRows();
                //总列数
                int totalCells = 0;
                //得到Excel的列数(前提是有行数)，从第二行算起
                if(totalRows>=2 && sheet.getRow(1) != null){
                    totalCells=sheet.getRow(1).getPhysicalNumberOfCells();
                }
        /*List<UserKnowledgeBase> userKnowledgeBaseList=new ArrayList<UserKnowledgeBase>();
        UserKnowledgeBase tempUserKB;*/



                //循环Excel行数,从第二行开始。标题不入库
                for(int r=1;r<totalRows;r++){
                    String rowMessage = "";
                    Row row = sheet.getRow(r);
                    if (row == null){
                        errorMsg += br+"第"+(i+1)+"页第"+(r+1)+"行数据有问题，请仔细检查！";
                        continue;
                    }
                    //tempUserKB = new UserKnowledgeBase();

                    String question = "";
                    String answer = "";

                    //循环Excel的列
                    for(int c = 0; c <totalCells; c++){
                        Cell cell = row.getCell(c);
                        if (null != cell){
                            cell.setCellType(Cell.CELL_TYPE_STRING);
                            answer = cell.getStringCellValue();
                            System.out.print(answer+"\n");
                            result += answer;
                    /*if(c==0){
                        question = cell.getStringCellValue();
                        if(StringUtils.isEmpty(question)){
                            rowMessage += "问题不能为空；";
                        }else if(question.length()>60){
                            rowMessage += "问题的字数不能超过60；";
                        }
                        System.out.print(question);
                        //tempUserKB.setQuestion(question);
                    }else if(c==1){
                        answer = cell.getStringCellValue();
                        System.out.print(answer);
                        if(StringUtils.isEmpty(answer)){
                            rowMessage += "答案不能为空；";
                        }else if(answer.length()>1000){
                            rowMessage += "答案的字数不能超过1000；";
                        }
                        //tempUserKB.setAnswer(answer);
                    }*/
                        }/*else{
                            rowMessage += "第"+(c+1)+"列数据有问题，请仔细检查；";
                        }*/
                    }
                    //拼接每行的错误提示
                    if(!StringUtils.isEmpty(rowMessage)){
                        errorMsg += br+"第"+(r+1)+"行，"+rowMessage;
                    }else{
                        //userKnowledgeBaseList.add(tempUserKB);
                    }
                }
            }
        }else {
            errorMsg = "文档暂无数据";
        }

        //删除上传的临时文件
        if(tempFile.exists()){
            tempFile.delete();
        }

        //全部验证通过才导入到数据库
        /*if(StringUtils.isEmpty(errorMsg)){
            for(UserKnowledgeBase userKnowledgeBase : userKnowledgeBaseList){
                this.saveUserKnowledge(userKnowledgeBase, userName);
            }
            errorMsg = "导入成功，共"+userKnowledgeBaseList.size()+"条数据！";
        }*/
        if(StringUtils.isEmpty(errorMsg)){
            return result;
        }else {
            return errorMsg;
        }
    }
}
