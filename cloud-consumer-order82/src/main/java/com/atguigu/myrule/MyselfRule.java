package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.WeightedResponseTimeRule;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author XiangRui
 * @create 2020-03-14 12:13 上午
 */
@Configuration
@Slf4j
public class MyselfRule {
    @Bean
    public IRule myRule(){
        return new WeightedResponseTimeRule();//定义为随机
    }
}
