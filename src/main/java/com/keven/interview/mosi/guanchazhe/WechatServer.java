package com.keven.interview.mosi.guanchazhe;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

/**
 * @author keven
 * @date 2018-05-27 上午9:03
 * @Description  主题（被观察者）
 */
public class WechatServer implements Observerable{


    private List<Observer> list;

    private String message;


    public WechatServer () {
        list = new ArrayList<>();
    }


    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (!list.isEmpty()) {
            list.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i< list.size(); i++) {
            Observer observer = list.get(i);
            observer.update(message);
        }
    }

    public void setInformation(String message) {
        this.message = message;
        System.out.println("微信公众好更新消息：" + message);
        notifyObserver();
    }
}
