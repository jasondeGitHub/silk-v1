package com.spark.bitrade;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableEurekaClient
@EnableAutoConfiguration
@SpringBootApplication
@EnableTransactionManagement(order = 10) //开启事务，并设置order值，默认是Integer的最大值
@EnableCaching
@ServletComponentScan("com.spark.bitrade.config") //开启Druid监控
@EnableFeignClients
@EnableAsync //开启异步
public class GuessApiApplication {

    public static void main(String[] args){
        SpringApplication.run(GuessApiApplication.class,args);
    }
}
