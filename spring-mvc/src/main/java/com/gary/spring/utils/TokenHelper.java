package com.gary.spring.utils;

import com.gary.faq.unit.OAuthTokenService;
import com.gary.faq.unit.bean.AccessToken;
import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import org.springframework.util.StringUtils;

import java.util.concurrent.TimeUnit;

/**
 * Created by Gary on 2019-06-10.
 *
 * @author Gary
 * @version 0.0.1
 * @date 2019-06-10
 * @since 0.0.1
 */
public class TokenHelper {
    private static OAuthTokenService oAuthTokenService;
    private static Cache<String, String> cache;

    static {
        cache = Caffeine.newBuilder()
                .expireAfterWrite(24, TimeUnit.HOURS)
                .build();
    }

    public void setoAuthTokenService(OAuthTokenService oAuthTokenService) {
        this.oAuthTokenService = oAuthTokenService;
    }

    public String getToken() {
        String key = "baidu-token";
        String token = cache.getIfPresent(key);
        if (StringUtils.isEmpty(token)) {
            AccessToken baiduToken = oAuthTokenService.getToken();
            token = baiduToken.getAccessToken();
            cache.put(key, token);
        }
        return token;
    }
}
