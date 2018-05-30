package com.keven.interview.jdk.proxy;

/**
 * @author keven
 * @date 2018-05-28 上午9:20
 * @Description  实现业务逻辑接口 创建 业务实现类
 */
public class BookFacadeImpl implements BookFacade{

    @Override
    public void addBook() {
        System.out.println("增加图书方法。。。");
    }
}
