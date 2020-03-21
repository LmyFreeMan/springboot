package com.web.controller;
import com.web.dao.DepartmentDao;
import com.web.entities.Department;
import com.web.entities.Employee;
import com.web.mapper.DepartmentMapper;
import com.web.mapper.EmployeeMapper;
import com.web.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@Controller
public class DeptController {

    @Autowired
    DepartmentService departmentService;
    //查询所有员工返回列表页面
    @GetMapping("/deps")
    public String  list(Model model){
       List<Department> departments = departmentService.getDepartments();
        model.addAttribute("deps",departments);
        return "back/dep/list";
    }
    //跳转到部门添加页面
    @GetMapping("/dep")
    public String addEmp(){
        return "back/dep/add";
    }
    //部门添加页面
    @PostMapping("/dep")
    public String addEmp(Department department){
        departmentService.insertDept(department.getDepartmentName());
        return "redirect:/deps";
    }
        //部门删除
    @DeleteMapping("/dep/{id}")
    public String deleteEmployee(@PathVariable("id") Integer id){
        departmentService.delete(id);
        return "redirect:/deps";
    }
    //来到修改页面
    @GetMapping("/dep/{id}")
    public String toEditPage(@PathVariable("id") Integer id,Model model){
        Department department = departmentService.getDeptById(id);
        model.addAttribute("dep",department);
        return "back/dep/add";
    }
    //部门修改
    @PutMapping("/dep")
    public String updateEmployee(Department department){
        departmentService.updateDept(department);
        return "redirect:/deps";
    }
}
