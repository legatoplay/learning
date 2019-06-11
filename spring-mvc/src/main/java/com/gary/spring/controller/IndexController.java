package com.gary.spring.controller;

import com.gary.faq.unit.ChatService;
import com.gary.faq.unit.OAuthTokenService;
import com.gary.faq.unit.bean.FaqAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.Cache;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Gary on 2019-06-10.
 *
 * @author Gary
 * @version 0.0.1
 * @date 2019-06-10
 * @since 0.0.1
 */
@RestController
public class IndexController {
    @Autowired
    private OAuthTokenService authTokenService;

    @Autowired
    private ChatService chatService;

    @GetMapping
    public FaqAction index(HttpServletRequest req) {
        FaqAction chat = chatService.chat(getToken(), "测试", "userId");
        System.out.println(chat);
        return chat;
    }

    /**
     * 获取百度token 要加到缓存里，缓存时间建议为20-23小时
     *
     * @return
     */
    private String getToken() {
        return authTokenService.getToken().getAccessToken();
    }
}
