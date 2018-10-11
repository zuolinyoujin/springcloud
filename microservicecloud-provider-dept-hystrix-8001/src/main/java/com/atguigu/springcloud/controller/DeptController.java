package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shkstart
 * @create 2018-10-09 下午 7:09
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService service = null;

    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    @RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id)
    {
        // 这个方法在访问时出现异常，进行熔断处理
        Dept dept = service.get(id);
        return dept;
    }

    public Dept processHystrix_Get(@PathVariable("id") Long id)
    {
        Dept dept = new Dept();
        dept.setDeptno(id);
        dept.setDname("该ID："+id+"没有没有对应的信息,null--@HystrixCommand");
        dept.setDbSource("no this database in MySQL");
        return dept;
    }

}
