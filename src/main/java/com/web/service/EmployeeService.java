package com.web.service;

import com.web.dao.EmployeeDao;
import com.web.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EmployeeService {
    @Autowired
    EmployeeDao employeeDao;

    public List getAllEmp() {
        return (List) employeeDao.getAll();
    }

    public void insertEmp(Employee employee) {
        employeeDao.insertEmp(employee);
    }

    public Employee getEmpById(Integer id) {
        return employeeDao.getEmpById(id);
    }

    public void updateEmpByWorkNum(Employee employee) {
        System.out.println(22);
      employeeDao.updateEmpByWorkNum(employee);
    }

    public void delete(Integer id) {
        employeeDao.delet(id);
    }
}


