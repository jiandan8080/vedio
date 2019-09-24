package com.zadmin.ts.API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @BelongsProject: vedio
 * @BelongsPackage: com.zadmin.ts.API
 * @Author: ZAdmin
 * @CreateTime: 2019-09-20 21:07
 * @Description: 消费者
 */
@SpringBootApplication //标记开关
@EnableDiscoveryClient //发现服务
@EnableFeignClients //启用Feign实现服务消费
public class VideoAPI {
    public static void main(String[] args) {
        SpringApplication.run(VideoAPI.class,args);
    }
}
