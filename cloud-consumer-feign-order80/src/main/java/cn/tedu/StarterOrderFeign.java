package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author XiangRui
 * @create 2020-03-28 10:31 下午
 */
//feign的客户端
@EnableFeignClients
@SpringBootApplication
public class StarterOrderFeign {
    public static void main(String[] args) {
        SpringApplication.run(StarterOrderFeign.class,args);
    }

}
