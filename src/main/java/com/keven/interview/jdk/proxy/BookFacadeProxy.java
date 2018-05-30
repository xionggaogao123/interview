package com.keven.interview.jdk.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.SQLSyntaxErrorException;

/**
 * @author keven
 * @date 2018-05-28 上午9:23
 * @Description
 */
public class BookFacadeProxy implements InvocationHandler{

    /**
     *  业务实现类对象，用来调用具体的业务方法
      */
    private Object target;


    public Object bind(Object target) {
        // 接受业务实现类对象参数
        this.target = target;
        //通过反射机制，创建一个代理类对象实例并返回， 用户进行方法调用时使用
        // 创建代理对象， 需要传递该业务类的类加载器（用来获取业务实现类的元数据，在包装方法是调用真正的业务方法）， 接口，handler 实现类
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        System.out.println("预处理操作--");
        result = method.invoke(target, args);

        System.out.println("调用后处理--");
        return result;
    }
}
