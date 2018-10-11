package com.atguigu.springcloud.entities;

/**
 * @author shkstart
 * @create 2018-10-08 下午 7:53
 */
public class Dept {

    private String dbSource;
    private String dname;
    private Long deptno;

    public String getDbSource() {
        return dbSource;
    }

    public void setDbSource(String dbSource) {
        this.dbSource = dbSource;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Long getDeptno() {
        return deptno;
    }

    public void setDeptno(Long deptno) {
        this.deptno = deptno;
    }
}
