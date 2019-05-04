package org.lhyf.cloud.controller;

import org.lhyf.cloud.entity.Dept;
import org.lhyf.cloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @PostMapping("/add")
    public boolean add(@RequestBody Dept dept) {
        return deptService.add(dept);
    }

    @GetMapping("/get/{id}")
    public Dept get(@PathVariable("id") Integer id) {
        return deptService.get(id);
    }

    @GetMapping("/list")
    public List<Dept> list() {
        return deptService.list();
    }
}
