package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author shkstart
 * @create 2018-10-08 下午 8:21
 */

@Controller
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    @ResponseBody
    public boolean add(@RequestBody Dept dept){
        return deptService.add(dept);
    }

    @RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
    @ResponseBody
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept get(@PathVariable("id") Long id)
    {
        return deptService.get(id);
    }

    public Dept processHystrix_Get(@PathVariable("id") Long id)
    {
        Dept dept = new Dept();
        dept.setDeptno(id);
        dept.setDname("该ID："+id+"没有没有对应的信息,null--@HystrixCommand");
        dept.setDbSource("no this database in MySQL");
        return dept;
    }

    @RequestMapping(value="/dept/list",method=RequestMethod.GET)
    @ResponseBody
    public List<Dept> list()
    {
        return deptService.list();
    }
}
