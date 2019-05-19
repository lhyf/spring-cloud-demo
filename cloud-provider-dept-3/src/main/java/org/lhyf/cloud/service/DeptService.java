package org.lhyf.cloud.service;

import org.lhyf.cloud.entity.Dept;

import java.util.List;

/****
 * @author YF
 * @date 2019-05-04 11:24
 * @desc DeptService
 *
 **/
public interface DeptService {
    boolean add(Dept dept);

    Dept get(Integer id);

    List<Dept> list();
}
