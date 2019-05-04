package org.lhyf.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/****
 * @author YF
 * @date 2019-05-04 10:50
 * @desc ProviderApplication
 *
 **/
@MapperScan(basePackages = "org.lhyf.cloud.mapper")
@SpringBootApplication
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
