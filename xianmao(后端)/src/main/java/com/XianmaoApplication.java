package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com")
@SpringBootApplication
@MapperScan("com.mapper")
public class XianmaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(XianmaoApplication.class, args);
    }

}
