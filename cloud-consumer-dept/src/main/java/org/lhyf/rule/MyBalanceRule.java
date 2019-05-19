package org.lhyf.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/****
 * @author YF
 * @date 2019-05-18 17:34
 * @desc MyBalanceRule
 *
 * 当前类不能放在@ComponentScan能扫描到的路径
 **/
@Configuration
public class MyBalanceRule {

    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
