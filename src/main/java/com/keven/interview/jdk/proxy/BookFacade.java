package com.keven.interview.jdk.proxy;

/**
 * @author keven
 * @date 2018-05-28 上午9:13
 * @Description  定义业务逻辑接口
 *
 *
 *  JDK 动态代理 所用到的 代理类 在程序调用到 代理类对象时 才由 jVM 真正创建
 *  JVM  根据 传进来的 业务 实现类对象 及 方法名， 动态的创建了一个代理类的 class 文件并被字节码 引擎执行， 然后通过该代理类对象进行方法的调用
 *
 *
 */
public interface BookFacade {

    void addBook();

}
