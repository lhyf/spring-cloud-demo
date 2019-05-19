package org.lhyf.cloud.service;

import feign.hystrix.FallbackFactory;
import org.lhyf.cloud.entity.Dept;
import org.springframework.stereotype.Component;

import java.util.List;

/****
 * @author YF
 * @date 2019-05-19 11:42
 * @desc DeptClientServiceFallbackFactory
 *
 * 不要忘记在此类上添加@Component注解
 **/

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {

            @Override
            public boolean add(Dept dept) {
                return false;
            }

            @Override
            public Dept get(Integer id) {
                Dept dept = new Dept();
                dept.setDeptNo(id);
                dept.setdName("服务降价");
                dept.setDbSource("此消息由hystrix返回");
                return dept;
            }

            @Override
            public List<Dept> list() {
                return null;
            }
        };
    }
}
