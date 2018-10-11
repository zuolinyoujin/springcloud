package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;
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
    public Dept get(@PathVariable("id") Long id)
    {
        return deptService.get(id);
    }

    @RequestMapping(value="/dept/list",method=RequestMethod.GET)
    @ResponseBody
    public List<Dept> list()
    {
        return deptService.list();
    }
}
