package com.keven.interview.spring;

import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

/**
 * @author keven
 * @date 2018-05-17 下午11:15
 * @Description
 *
 *
 * 一般情况下，当我们需要实现InstantiationAwareBeanPostProcessor接口时，
 * 是通过继承Spring框架中InstantiationAwareBeanPostProcessor接口实现类
 *
 * InstantiationAwareBeanPostProcessorAdapter这个适配器类来简化我们实现接口的工作
 *
 *
 */
public class MyInstantiationAwareBeanPostProcessor extends InstantiationAwareBeanPostProcessorAdapter{


    public MyInstantiationAwareBeanPostProcessor() {
        System.out.println("[InstantiationAwaerBeanPostProcessor接口] 调用InstantiationAwareBeanPostProcessor 构造方法");
    }

    
}
