package com.hb.upms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableDiscoveryClient
@MapperScan({"com.hb.upms.mapper"})
@SpringBootApplication
public class HbWmsApplication {//extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(HbWmsApplication.class, args);
    }

   /* @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里一定要指向原先用main方法执行的Application启动类
        return builder.sources(HbWmsApplication.class);
    }*/

}
