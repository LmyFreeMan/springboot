package com.web.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.web.entities.Department;
import com.web.entities.Employee;
import com.web.service.DepartmentService;
import com.web.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    @Autowired
    DepartmentService departService;

    //查询所有员工返回列表页面
    @GetMapping("/emps")
    public String  list(Model model,@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "3") int pageSize){
       Page page=PageHelper.startPage(pageNo,pageSize);
        Collection<Employee> employees = employeeService.getAllEmp();
        model.addAttribute("totalPages",page.getPages());
        model.addAttribute("PageSize",page.getPageSize());
        model.addAttribute("emps",employees);
        return "back/emp/list";
    }

    //来到员工添加页面
    @GetMapping("/emp")
    public String toAddPage(Model model){
        //来到添加页面,查出所有的部门，在页面显示
        Collection<Department> departments = departService.getDepartments();
        System.out.println(departments);
        System.out.println(55);
        model.addAttribute("depts",departments);
        return "back/emp/add";
    }

    //员工添加
    @PostMapping("/emp")
    public String addEmp(Employee employee){

        System.out.println("保存的员工信息："+employee);
        //保存员工
        employeeService.insertEmp(employee);
        // redirect: 表示重定向到一个地址  /代表当前项目路径
        // forward: 表示转发到一个地址
        return "redirect:/emps";
    }
//
    //来到修改页面，查出当前员工，在页面回显
    @GetMapping("/emp/{id}")
    public String toEditPage(@PathVariable("id") Integer id,Model model){
        Employee employee = employeeService.getEmpById(id);
        model.addAttribute("emp",employee);
        //页面要显示所有的部门列表
        Collection<Department> departments = departService.getDepartments();
        model.addAttribute("depts",departments);
        //回到修改页面(add是一个修改添加二合一的页面);
        return "back/emp/add";
    }
//
    //员工修改；需要提交员工id；
    @PutMapping("/emp")
    public String updateEmployee(Employee employee){
        System.out.println("修改的员工数据："+employee);
        employeeService.updateEmpByWorkNum(employee);
        return "redirect:/emps";
    }
//
    //员工删除
    @DeleteMapping("/emp/{id}")
    public String deleteEmployee(@PathVariable("id") Integer id){
        employeeService.delete(id);
        return "redirect:/emps";
    }



}
