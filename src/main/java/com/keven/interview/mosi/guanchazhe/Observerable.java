package com.keven.interview.mosi.guanchazhe;

/**
 * @author keven
 * @date 2018-05-27 上午9:01
 * @Description  抽象主题
 */
public interface Observerable {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
