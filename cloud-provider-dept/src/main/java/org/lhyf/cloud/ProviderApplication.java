package org.lhyf.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

/****
 * @author YF
 * @date 2019-05-04 10:50
 * @desc ProviderApplication
 *
 **/
@MapperScan(basePackages = "org.lhyf.cloud.mapper")
@EnableEurekaClient // 开启Eureka注册
@SpringBootApplication
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
