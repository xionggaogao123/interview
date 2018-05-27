package com.keven.interview.mosi.guanchazhe;

/**
 * @author keven
 * @date 2018-05-27 上午9:10
 * @Description
 */
public class User implements Observer{


    private String name;
    private String message;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message = message;
        read();
    }


    public void read() {
        System.out.println(name + "收到公众好消息" + message);
    }
}
