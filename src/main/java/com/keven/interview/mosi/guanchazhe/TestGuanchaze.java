package com.keven.interview.mosi.guanchazhe;

/**
 * @author keven
 * @date 2018-05-27 上午9:14
 * @Description
 */
public class TestGuanchaze {
    public static void main(String[] args) {

        WechatServer server = new WechatServer();

        Observer zhangsan = new User("张三");
        Observer lisi = new User("lisi");
        server.registerObserver(zhangsan);
        server.registerObserver(lisi);

        server.setInformation("谢谢关注~");
    }
}
