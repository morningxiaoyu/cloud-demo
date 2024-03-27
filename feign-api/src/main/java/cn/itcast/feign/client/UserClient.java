package cn.itcast.feign.client;

import cn.itcast.feign.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * ClassName:UserClient
 * Package:cn.itcast.order.client
 * Description:
 *
 * @Date:2024/3/26 14:20
 * @Author:rainz
 */
@FeignClient("userservice")
public interface UserClient {
    @GetMapping("/user/{id}")
    User findById(@PathVariable("id") Long id);
}
