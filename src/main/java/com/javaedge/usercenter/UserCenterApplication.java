package com.javaedge.usercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author JavaEdge
 */
@MapperScan("com.javaedge.usercenter.dao")
@SpringBootApplication
@EnableBinding({Sink.class})
//@EnableDiscoveryClient，在早期版本需要该注解，但现在不需要了
public class UserCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserCenterApplication.class, args);
    }
}
