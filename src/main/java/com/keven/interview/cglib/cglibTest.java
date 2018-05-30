package com.keven.interview.cglib;

import com.keven.interview.jdk.proxy.BookFacadeImpl;

/**
 * @author keven
 * @date 2018-05-28 上午9:48
 * @Description
 *
 *
 * 创建业务类 和 代理类对象， 然后通过 代理类对象.getInstance(业务类对象)返回一个动态代理对象
 * 最后通过动态代理类对象进行方法的调用
 *
 *
 * JDK 动态代理 是 通过 接口中的方法名， 在动态生成的代理类中 调用业务实现类 的 同名方法，
 * 如果实现类中没有接口中的方法，是无法被代理的
 *
 * Cglib 动态代理 是 通过 继承业务类， 生成的动态代理类 是  业务类的子类， 通过重写业务方法进行代理
 *
 */
public class cglibTest {

    public static void main(String[] args) {
        BookFacadeImpl bookFacade = new BookFacadeImpl();
        BookFadeCglib bookFadeCglib = new BookFadeCglib();
        BookFacadeImpl bookFacade1 = (BookFacadeImpl) bookFadeCglib.getInstance(bookFacade);
        bookFacade1.addBook();
    }
}
