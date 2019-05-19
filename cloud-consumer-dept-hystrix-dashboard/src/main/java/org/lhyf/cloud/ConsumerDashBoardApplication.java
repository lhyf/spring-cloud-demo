package org.lhyf.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/****
 * @author YF
 * @date 2019-05-19 15:45
 * @desc ConsumerDashBoardApplication
 *
 **/
@EnableHystrixDashboard // 开启dashboard
@SpringBootApplication
public class ConsumerDashBoardApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerDashBoardApplication.class, args);
    }
}
