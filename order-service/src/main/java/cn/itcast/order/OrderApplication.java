package cn.itcast.order;

import cn.itcast.feign.client.UserClient;
import cn.itcast.feign.config.DefaultFeignConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@MapperScan("cn.itcast.order.mapper")
@EnableFeignClients(clients = {UserClient.class}, defaultConfiguration = DefaultFeignConfiguration.class)
@SpringBootApplication
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }

}