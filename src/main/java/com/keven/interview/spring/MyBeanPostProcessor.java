package com.keven.interview.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author keven
 * @date 2018-05-17 下午11:07
 * @Description  编写BeanPostProcessor 接口的一个 实现类： MyBeanPostProcessor
 */
public class MyBeanPostProcessor implements BeanPostProcessor{


    public MyBeanPostProcessor() {
        System.out.println("[BeanPostProcessor 接口]调用BeanPostProcessor的构造方法");
    }


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("[BeanPostProcessor接口] 调用PostProcessBeforeIntialization方法，这里可对" + beanName + "的属性进行更改");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("[BeanPostProcessor接口] 调用postProcessAfterInitialization方法，这里也可以对" + beanName + "的属性进行更改");
        return bean;
    }
}
