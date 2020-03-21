package com.web.mapper;


import com.web.entities.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.assertj.core.internal.cglib.asm.$Attribute;

import java.util.List;

//@Mapper或者@MapperScan将接口扫描装配到容器中
@Mapper
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);

    public List getAllEmp();

    public void updateEmpByWorkNum(Employee employee);

    void delete(Integer id);
}
