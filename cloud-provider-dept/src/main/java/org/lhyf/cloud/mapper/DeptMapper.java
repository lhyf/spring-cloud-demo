package org.lhyf.cloud.mapper;

import org.lhyf.cloud.entity.Dept;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface DeptMapper extends Mapper<Dept> {

    boolean addDept(Dept dept);

    Dept findById(Integer id);

    List<Dept> findAll();
}