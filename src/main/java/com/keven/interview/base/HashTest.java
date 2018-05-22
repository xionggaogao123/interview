package com.keven.interview.base;

/**
 * @author keven
 * @date 2018-05-21 下午2:37
 * @Description
 */
public class HashTest {

    public static void main(String[] args){
        String ip = "192.168.10.32";


        int ipHash = hash(ip);
        int result = ipHash % 1024;
        System.out.println(ipHash);
        System.out.println(result);
    }

    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
}
