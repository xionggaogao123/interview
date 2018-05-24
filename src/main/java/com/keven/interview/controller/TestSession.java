package com.keven.interview.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author keven
 * @date 2018-05-22 下午11:17
 * @Description
 *
 *
 *
 *
 */
@RestController
public class TestSession {


    @GetMapping("test/session")
    public String getSessionId (HttpServletRequest request) {
        String sessionId = request.getSession().getId();

        return sessionId;
    }
}
