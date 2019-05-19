package org.lhyf.cloud.controller;

import org.lhyf.cloud.entity.Dept;
import org.lhyf.cloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/****
 * @author YF
 * @date 2019-05-04 20:09
 * @desc DeptController
 *
 **/
@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptClientService clientService;

    @PostMapping("/add")
    public boolean add(@RequestBody Dept dept) {
        return clientService.add(dept);
    }

    @GetMapping("/get/{id}")
    public Dept get(@PathVariable("id") Integer id) {
        return clientService.get(id);
    }

    @GetMapping("/list")
    public List<Dept> list() {
        return clientService.list();
    }

}
