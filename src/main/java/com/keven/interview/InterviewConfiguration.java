package com.keven.interview;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author keven
 * @date 2018-05-14 下午10:48
 * @Description
 */
@EnableWebMvc
@EnableAutoConfiguration
@EnableScheduling
@Configuration
@ComponentScan({"com.keven.interview"})
public class InterviewConfiguration {

}
