package com.web.dao;

import java.util.List;

import com.web.entities.Department;
import com.web.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class DepartmentDao {

	@Autowired
	DepartmentMapper departmentMapper;

	public List<Department> getDepartments(){
		return departmentMapper.getDepartments();
	}

	public Integer insertDept(String departmentName) {
		return departmentMapper.insertDept(departmentName);
	}

	public void delete(Integer id) {
		departmentMapper.deleteDeptById(id);
	}

	public Department getDeptById(Integer id){
		return departmentMapper.getDeptById(id);
	}

	public void updateDept(Department department) {
		departmentMapper.updateDept(department);
	}
}
