package springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author XiangRui
 * @create 2020-04-10 3:25 下午
 */
public interface LoadBalancer {
    ServiceInstance instance (List<ServiceInstance> serviceInstances);
}
