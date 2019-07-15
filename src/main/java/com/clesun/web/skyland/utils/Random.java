package com.clesun.web.skyland.utils;

import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;

/**
 * Created by lsw on 2017/5/12.
 */
public class Random {
    private static SecureRandom secureRandom = new SecureRandom();

    private static Random random= new Random();

    public static Random getInstance(){
        secureRandom.setSeed(secureRandom.nextInt());
        if(random == null){
            synchronized (Random.class){
                random = new Random();
            }
        }
        return random;
    }

    public String getRandCode(int len){
        if(len>10){
            len = 10;
        }
        return String.valueOf(Math.abs(secureRandom.nextInt())).substring(0,len);
    }


    public static void main(String args[]){
        String area = "北京市";
        try {
            area = new String(area.getBytes("UTF-8"),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.print(area);
    }


}
