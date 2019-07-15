package com.clesun.web.skyland.task;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestTask {
    public void exe(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("执行时间："+sdf.format(date));
        System.out.println("我是测试任务，执行成功了");
    }
}
