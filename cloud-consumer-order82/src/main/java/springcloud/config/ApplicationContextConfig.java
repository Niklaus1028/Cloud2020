package springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author XiangRui
 * @create 2020-03-11 10:45 下午
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    //@LoadBalanced//赋予resttemplate负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();

    }
}
