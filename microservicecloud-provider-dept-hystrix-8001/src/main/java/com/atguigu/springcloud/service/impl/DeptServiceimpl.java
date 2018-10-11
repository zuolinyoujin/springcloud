package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.DeptDao;
import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shkstart
 * @create 2018-10-09 下午 7:18
 */
@Service
public class DeptServiceimpl implements DeptService {
    @Autowired
    private DeptDao dao ;

    @Override
    public boolean add(Dept dept)

    {
        boolean b = false;
        int insert = dao.insert(dept);
        if(insert>0){
            b = true;
        }
        return b;
    }

    @Override
    public Dept get(Long id)
    {
        Dept dept = new Dept();
        dept.setDeptno(id);
        Dept dept1 = dao.selectOne(dept);
        return dept1;
    }

    @Override
    public List<Dept> list()
    {
        return dao.selectAll();
    }
}
