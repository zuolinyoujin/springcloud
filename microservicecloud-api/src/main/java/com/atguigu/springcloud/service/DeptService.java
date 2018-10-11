package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Dept;

import java.util.List;

/**
 * @author shkstart
 * @create 2018-10-08 下午 8:02
 */
public interface DeptService {

    public boolean add(Dept dept);
    public Dept get(Long id);
    public List<Dept> list();
}
