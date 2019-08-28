package com.cjh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = "com.cjh.dao")
@SpringBootApplication
public class SpringBootRestfulApiTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestfulApiTemplateApplication.class, args);
    }

}
