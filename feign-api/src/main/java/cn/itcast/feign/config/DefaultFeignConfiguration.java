package cn.itcast.feign.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * ClassName:DefaultFeignConfiguration
 * Package:cn.itcast.order.config
 * Description:
 *
 * @Date:2024/3/26 14:28
 * @Author:rainz
 */
public class DefaultFeignConfiguration {
    @Bean
    public Logger.Level feignLogLevel(){
        return Logger.Level.BASIC; // 日志级别为BASIC
    }
}
