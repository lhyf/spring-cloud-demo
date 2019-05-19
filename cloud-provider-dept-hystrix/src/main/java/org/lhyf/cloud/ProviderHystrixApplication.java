package org.lhyf.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

/****
 * @author YF
 * @date 2019-05-19 10:50
 * @desc ProviderApplication
 *
 **/
@MapperScan(basePackages = "org.lhyf.cloud.mapper")
@EnableCircuitBreaker // 对hystrix熔断机制支持
@EnableEurekaClient // 开启Eureka注册
@EnableDiscoveryClient // 服务发现
@SpringBootApplication
public class ProviderHystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderHystrixApplication.class, args);
    }
}
