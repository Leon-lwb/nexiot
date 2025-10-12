/*
 *
 * Copyright (c) 2025, IoT-Universal. All Rights Reserved.
 *
 * @Description: 本文件由 Aleo 开发并拥有版权，未经授权严禁擅自商用、复制或传播。
 * @Author: Aleo
 * @Email: wo8335224@gmail.com
 * @Wechat: outlookFil
 *
 *
 */

package cn.universal;

import cn.universal.cache.config.MultiLevelCacheProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * platform Universal 平台主应用启动类
 *
 * @author Aleo
 * @since 2025/1/1
 */
@Slf4j
@SpringBootApplication
@EnableAsync(proxyTargetClass = false)
@EnableAspectJAutoProxy(proxyTargetClass = false, exposeProxy = true)
@EnableCaching
@EnableScheduling
@EnableConfigurationProperties({MultiLevelCacheProperties.class})
public class CnUniversalIoTApplication {


    public static void main(String[] args) {
        log.info("Universal-IoT  平台正在启动...");
        SpringApplication.run(CnUniversalIoTApplication.class, args);
    }
}
