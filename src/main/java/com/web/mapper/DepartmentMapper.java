package com.web.mapper;


import com.web.entities.Department;
import org.apache.ibatis.annotations.*;

import java.util.List;

//指定这是一个操作数据库的mapper
@Mapper
public interface DepartmentMapper {

    public Department getDeptById(Integer id);

    public int deleteDeptById(Integer id);

    public Integer insertDept(String departmentName);

    public int updateDept(Department department);

    public  List<Department> getDepartments();

}
