package com.kang.svc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: kang
 * @DateTime: 2022-07-31-9:52
 * @Description: 必备注解统一配置处
 */
@Configuration
@ComponentScan(basePackages = {"com.kang.demo.svc.config",
        "com.kang.demo.svc.dao",
        "com.kang.demo.svc.service",
        "com.kang.demo.svc.controller"})
public class ScanBasePackage {
}
