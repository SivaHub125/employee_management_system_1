package com.project.employee_management_system.service;
import java.util.List;
import java.util.Optional;

import com.project.employee_management_system.model.Employee;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    void deleteEmployeeById(long id);
}