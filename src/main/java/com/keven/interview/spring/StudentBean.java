package com.keven.interview.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * @author keven
 * @date 2018-05-17 下午8:28
 * @Description
 *
 *  编写一个测试类 StudentBean 来实现 bean 生命周期的 整个流程
 */
public class StudentBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware{


    private String name;

    private int age;

    /**
     * 实现了BeanNameAware 接口，Spring 可以将 BeanName 注入该属性中
     */
    private String beanName;

    /**
     * 实现了BeanFactory 接口， Spring 可将 BeanFactory 注入该属性中
     */
    private BeanFactory beanFactory;


    public StudentBean() {
        System.out.println("【Bean 构造方法】学生类的无参构造方法");
    }


    @Override
    public String toString() {
        return  "name = " + name + ", age=" + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("[Set 注入] 注入学生的name 属性 ");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("[set 注入] 注入学生的age属性");
        this.age = age;
    }


    public void myInit() {
        System.out.println("[init-method] 调用init-method 属性配置的初始化方法");
    }

    public void myDestroy() {
        System.out.println("[destroy-method] 调用destroy-method 属性配置的销毁方法");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
        System.out.println("[BeanFactoryAware接口] 调用BeanFactoryAware的setBeanFactory 方法得到 beanFactory引用");
    }


    /**
     * BeanNameAware 接口的方法
     * @param name
     */
    @Override
    public void setBeanName(String name) {
        this.beanName = name;
        System.out.println("[BeanNameAware接口] 调用BeanNameWare的setBeanName方法得到bean 的名称");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("【DisposableBean接口】调用DisposableBean接口的destroy方法");
    }


    /**
     * initializlingBean 接口的方法
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("[InitializingBean 接口] 调用initiallizingBean 接口的afterPropertiesSet方法");

    }
}
