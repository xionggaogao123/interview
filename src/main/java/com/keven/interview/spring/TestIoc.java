package com.keven.interview.spring;

import com.keven.interview.domain.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 通过 配置文件的方法 将 bean  注入到ioc 容器中
 */
public class TestIoc {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student");
        String name = student.getName();
        System.out.println(name);
    }
}
