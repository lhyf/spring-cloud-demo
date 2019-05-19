package org.lhyf.cloud;

import org.lhyf.rule.MyBalanceRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/****
 * @author YF
 * @date 2019-05-04 20:25
 * @desc ConsumerApplication
 *
 **/
// RibbonClient 为特定的服务配置指定的负载规则
@RibbonClient(name = "PROVIDER-DEPT",configuration = MyBalanceRule.class)
@EnableEurekaClient
@SpringBootApplication
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
