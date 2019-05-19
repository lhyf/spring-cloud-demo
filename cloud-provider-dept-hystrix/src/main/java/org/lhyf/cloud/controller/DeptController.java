package org.lhyf.cloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.lhyf.cloud.entity.Dept;
import org.lhyf.cloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/****
 * @author YF
 * @date 2019-05-04 11:28
 * @desc DeptController
 *
 **/
@RestController
@RequestMapping("/dept")
public class DeptController {


    @Autowired
    private DeptService deptService;


    //一旦调用服务方法失败,并抛出错误信息后,会自动调用@HystrixCommand 标注好的fallbackMethod指定的方法
    @HystrixCommand(fallbackMethod = "processHystrix")
    @GetMapping("/get/{id}")
    public Dept get(@PathVariable("id") Integer id) {
        Dept dept = deptService.get(id);
        if(dept == null){
            throw new RuntimeException("id不存在!");
        }
        return dept;
    }

    public Dept processHystrix(@PathVariable("id") Integer id){
        Dept dept = new Dept();
        dept.setDeptNo(id);
        dept.setDbSource("null");
        dept.setdName("服务熔断");
        return dept;
    }
}
