package com.web.dao;

import java.util.List;
import java.util.Map;

import com.web.entities.Employee;
import com.web.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {



	@Autowired
	private DepartmentDao departmentDao;
	@Autowired
	EmployeeMapper employeeMapper;

	public void insertEmp(Employee employee){
	    employeeMapper.insertEmp(employee);
	}

	//查询所有员工
	public List getAll(){
		return employeeMapper.getAllEmp();
	}
	
	public Employee getEmpById(Integer id){
		return employeeMapper.getEmpById(id);
	}

	public void updateEmpByWorkNum(Employee employee) {
		System.out.println(33);
		employeeMapper.updateEmpByWorkNum(employee);
	}

	public void delet(Integer id) {
		employeeMapper.delete(id);
	}

//	public void delete(Integer id){
//		employees.remove(id);
//	}
}
