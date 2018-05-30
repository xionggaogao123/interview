package com.keven.interview.cglib;

import org.mockito.cglib.proxy.Enhancer;
import org.mockito.cglib.proxy.MethodInterceptor;
import org.mockito.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author keven
 * @date 2018-05-28 上午9:39
 * @Description
 */
public class BookFadeCglib implements MethodInterceptor{


    /**
     * 业务类 对象，供代理方法中进行真正的业务方法调用
     */
    private Object target;


    public Object getInstance(Object target) {
        // 给业务对象赋值
        this.target = target;

        // 创建加强器， 用来创建动态的代理类
        Enhancer enhancer = new Enhancer();

        //为加强器指定要代理的业务类
        enhancer.setSuperclass(this.target.getClass());

        //设置回调， 对于代理类上所有方法的调用， 都会调用callBack ， 而CallBack 则需要实现intercept()方法进行拦截
        enhancer.setCallback(this);

        //创建动态代理类对象并返回
        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("预处理---");
        //调用业务类（父类中的方法）
        methodProxy.invokeSuper(o, objects);
        System.out.println("调用后操作---");
        return null;
    }
}
