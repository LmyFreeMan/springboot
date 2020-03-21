package com.web.service;

import com.web.dao.DepartmentDao;
import com.web.entities.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class DepartmentService {
    @Autowired
    DepartmentDao departmentDao;
    public List getDepartments(){
        return departmentDao.getDepartments();
    }
    public Integer insertDept(String departmentName){
       return departmentDao.insertDept(departmentName);
    }

    public void delete(Integer id) {
        departmentDao.delete(id);
    }

    public Department getDeptById(Integer id) {
        return departmentDao.getDeptById(id);
    }

    public void updateDept(Department department) {
         departmentDao.updateDept(department);
    }
}
