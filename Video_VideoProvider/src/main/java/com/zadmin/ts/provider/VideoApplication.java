package com.zadmin.ts.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @BelongsProject: vedio
 * @BelongsPackage: com.zadmin.ts.provider
 * @Author: ZAdmin
 * @CreateTime: 2019-09-20 21:03
 * @Description: 服务提供者
 */
@SpringBootApplication //标记开关启动
@EnableDiscoveryClient //注册服务
public class VideoApplication {
    public static void main(String[] args) {
        SpringApplication.run(VideoApplication.class,args);
    }
}
