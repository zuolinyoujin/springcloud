package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author shkstart
 * @create 2018-10-09 下午 8:18
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService(){
            @Override
            public boolean add(Dept dept) {
                return false;
            }

            @Override
            public Dept get(Long id)
            {
                Dept dept = new Dept();
                dept.setDeptno(id);
                dept.setDname("该ID："+id+"没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭");
                dept.setDbSource("no this database in MySQL");

                return dept;


            }

            @Override
            public List<Dept> list() {
                return null;
            }
        };
    }
}
