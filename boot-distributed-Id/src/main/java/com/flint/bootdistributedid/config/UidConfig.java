package com.flint.bootdistributedid.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
//导入外部XML配置文件
@ImportResource(locations = "classpath:uid/cached-uid-spring.xml")
public class UidConfig {
}
