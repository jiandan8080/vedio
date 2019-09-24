package com.zamin.ts.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @BelongsProject: vedio
 * @BelongsPackage: com.zamin.ts.server
 * @Author: ZAdmin
 * @CreateTime: 2019-09-20 20:56
 * @Description: 注册中心
 */

@SpringBootApplication //标记开关类
@EnableEurekaServer //标记注册中心
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class,args);
    }
}
