package com.web;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/*
*@SpringBootApplication来表明程序，表面这是一个SpringBoot应用
*
* */
@SpringBootApplication

//给容器中添加组件
//@ImportResource(locations = {"classpath:bean.xml"})
public class StartApplication {
    public static void main(String[] args) {
        //Spring应用程序跑起来
        SpringApplication.run(StartApplication.class,args);
    }
}
