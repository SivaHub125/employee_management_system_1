package com.project.employee_management_system.controller;

import com.project.employee_management_system.model.Employee;
import com.project.employee_management_system.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path="/")
    public List<Employee> viewHomePage() {
        return employeeService.getAllEmployees();
    }
    @PostMapping(path="/saveEmployee")
    public String saveEmployees(@RequestBody Employee employee){
        this.employeeService.saveEmployee(employee);
        return "Added";
    }
    @DeleteMapping(path="/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable(value = "id") long id){
        this.employeeService.deleteEmployeeById(id);
        return "Deleted";
    }
    @PutMapping(path="/updateEmployee/{id}")
    public String updateEmployeeForm(@RequestBody Employee employee,@PathVariable(value="id") long id) {
        this.employeeService.saveEmployee(employee);
        return "Updated Employee";
    }

}
