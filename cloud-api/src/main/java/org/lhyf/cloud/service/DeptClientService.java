package org.lhyf.cloud.service;

import org.lhyf.cloud.entity.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/****
 * @author YF
 * @date 2019-05-18 20:41
 * @desc DeptClientService
 *
 **/
@FeignClient(value = "PROVIDER-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

    @GetMapping("/provider/dept/add")
    boolean add(Dept dept);

    @GetMapping("/provider/dept/get/{id}")
    Dept get(@PathVariable("id") Integer id);

    @GetMapping("/provider/dept/list")
    List<Dept> list();
}
