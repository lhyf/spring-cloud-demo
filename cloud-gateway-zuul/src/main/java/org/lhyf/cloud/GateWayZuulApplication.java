package org.lhyf.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/****
 * @author YF
 * @date 2019-05-19 16:41
 * @desc GateWayZuulApplication
 *
 **/
// http://127.0.0.1:9527/provider-dept/provider/dept/get/1
// http://127.0.0.1:9527/微服务名/原微服务访问路径
@EnableZuulProxy
@SpringBootApplication
public class GateWayZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(GateWayZuulApplication.class,args);
    }
}
