package org.lhyf.cloud.controller;

import org.lhyf.cloud.entity.Dept;
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

    private static final String REST_URL_PREFIX = "http://127.0.0.1:8001/provider";

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/add")
    public boolean add(@RequestBody Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
    }

    @GetMapping("/get/{id}")
    public Dept get(@PathVariable("id") Integer id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
    }

    @GetMapping("/list")
    public List<Dept> list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
    }
}
