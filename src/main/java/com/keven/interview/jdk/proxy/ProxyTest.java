package com.keven.interview.jdk.proxy;

/**
 * @author keven
 * @date 2018-05-28 上午9:31
 * @Description
 *
 * JDK 动态代理 的代理对象在创建时， 需要使用业务 实现类 所实现的接口 作为参数，
 * 如果业务实现类是没有实现接口而是直接 定义业务方法的话， 就无法使用 JDK 动态代理了。
 * 并且， 如果业务实现类中新增了 接口中没有的方法， 这些方法是无法被代理的（因为无法被调用）
 *
 * 简单的说， JDK 动态代理 是针对 接口 来实现 代理的。
 */
public class ProxyTest {

    public static void main(String[] args) {

        BookFacadeImpl bookFacadeImpl = new BookFacadeImpl();
        BookFacadeProxy proxy = new BookFacadeProxy();
        BookFacade bookFacade = (BookFacade) proxy.bind(bookFacadeImpl);
        bookFacade.addBook();
    }
}
