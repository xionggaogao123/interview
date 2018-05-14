package com.keven.interview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author keven
 * @date 2018-05-14 下午10:47
 * @Description
 */
@SpringBootApplication
public class InterviewApplication {
    public static void main(String[] args){
        SpringApplication application = new SpringApplication(InterviewApplication.class);
        application.run(args);
    }
}
