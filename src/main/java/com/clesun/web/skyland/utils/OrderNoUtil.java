package com.clesun.web.skyland.utils;

import java.util.Date;

/**
 * Created by clesun on 2017/12/7.
 * 订单编号生成工具类
 */
public class OrderNoUtil {
    public static String createOrderNo(){
        Random random = new Random();
        String seq = random.getRandCode(5);
        String orderNo = DateUtils.formatDate(new Date(),"yyyyMMddHHmmss").toString()+seq;
        return orderNo;
    }
}
