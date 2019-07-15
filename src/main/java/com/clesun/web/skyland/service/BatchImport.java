package com.clesun.web.skyland.service;

import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * Created by clesun on 2017/11/13.
 */
public interface BatchImport {
    /**
     * 上传excel文件到临时目录后并开始解析
     * @author lxq
     * @DATE 2017/11/13
     * @param fileName
     * @param mfile
     * @return
     */
    public String batchImport(String fileName, MultipartFile mfile);

    /**
     * 解析Excel里面的数据
     * @author lxq
     * @DATE 2017/11/13
     * @param wb
     * @param tempFile
     * @return
     */
    public String readExcelValue(Workbook wb, File tempFile);
}
