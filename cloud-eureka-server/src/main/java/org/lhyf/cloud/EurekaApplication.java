package org.lhyf.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/****
 * @author YF
 * @date 2019-05-04 21:25
 * @desc EurekaApplication
 *
 **/
@SpringBootApplication
@EnableEurekaServer //开启Eureka服务端服务
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }
}
