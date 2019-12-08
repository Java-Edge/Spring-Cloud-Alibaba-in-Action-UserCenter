package com.javaedge.usercenter;

import com.javaedge.usercenter.rocketmq.MySink;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author JavaEdge
 */
@MapperScan("com.javaedge.usercenter.dao")
@SpringBootApplication
@EnableBinding({Sink.class, MySink.class})
public class UserCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserCenterApplication.class, args);
    }
}
