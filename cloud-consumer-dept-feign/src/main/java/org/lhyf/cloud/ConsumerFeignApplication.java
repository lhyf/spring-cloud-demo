package org.lhyf.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/****
 * @author YF
 * @date 2019-05-04 20:25
 * @desc ConsumerApplication
 *
 **/
@EnableFeignClients // 开启feign
@EnableEurekaClient
@SpringBootApplication
public class ConsumerFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignApplication.class, args);
    }
}
