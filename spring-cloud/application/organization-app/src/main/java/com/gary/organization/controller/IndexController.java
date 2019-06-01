package com.gary.organization.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Gary on 2019-06-01.
 *
 * @author Gary
 * @version 0.0.1
 * @date 2019-06-01
 * @since 0.0.1
 */
@RestController
public class IndexController {
    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return "hello " + name + "，this is new world";
    }
}
