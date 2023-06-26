package com.project.employee_management_system.service;
import java.util.List;

import org.springframework.data.domain.Page;

import com.project.employee_management_system.model.Employee;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    void deleteEmployeeById(long id);
    //public void updateEmployee(Employee employee,long id);
}