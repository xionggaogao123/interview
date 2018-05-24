package com.keven.interview.base;

/**
 * @author keven
 * @date 2018-05-23 下午4:58
 * @Description  字符串 -->  float -> int
 */
public class TestString {

    public static void main(String [] args){
        String a = "0.23";
        Float aa = (Float.valueOf(a) * 100);
        Integer aaa = aa.intValue();
        System.out.println(aa);
    }
}
