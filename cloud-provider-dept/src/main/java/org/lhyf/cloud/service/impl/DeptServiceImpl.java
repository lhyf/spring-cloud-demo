package org.lhyf.cloud.service.impl;

import org.lhyf.cloud.entity.Dept;
import org.lhyf.cloud.mapper.DeptMapper;
import org.lhyf.cloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/****
 * @author YF
 * @date 2019-05-04 11:25
 * @desc DeptServiceImpl
 *
 **/
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public boolean add(Dept dept) {
        return deptMapper.addDept(dept);
    }

    @Override
    public Dept get(Integer id) {
        return deptMapper.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptMapper.findAll();
    }
}
