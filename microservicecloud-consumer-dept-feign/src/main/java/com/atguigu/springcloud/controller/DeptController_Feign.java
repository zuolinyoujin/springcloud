package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author shkstart
 * @create 2018-10-09 下午 4:58
 */
@RestController
public class DeptController_Feign implements DeptClientService {

    @Autowired
    DeptClientService deptClientService;


    @Override
    @RequestMapping(value="/consumer/dept/add")
    public boolean add(Dept dept) {
        boolean add = deptClientService.add(dept);
        return add;
    }

    @Override
    @RequestMapping(value="/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        Dept dept = deptClientService.get(id);
        return dept;
    }

    @Override
    @SuppressWarnings("unchecked")
    @RequestMapping(value="/consumer/dept/list")
    public List<Dept> list() {
        List<Dept> list = deptClientService.list();
        return list;
    }
}
