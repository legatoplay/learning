package com.gary.organization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by Gary on 2019-06-01.
 *
 * @author Gary
 * @version 0.0.1
 * @date 2019-06-01
 * @since 0.0.1
 */
@EnableEurekaClient
@SpringBootApplication
public class OrganizationApp {
    public static void main(String[] args) {
        SpringApplication.run(OrganizationApp.class, args);
    }
}
