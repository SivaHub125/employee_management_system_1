package com.project.employee_management_system.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import io.micrometer.common.KeyValues;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import org.springframework.stereotype.Service;

import com.project.employee_management_system.model.Employee;
import com.project.employee_management_system.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private static List<Employee> list=new ArrayList<>();
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        this.employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployeeById(long id) {
        this.employeeRepository.deleteById(id);
    }

    /*@Override
    public void updateEmployee(Employee employee,long id){
        list=list.stream().map(b->{
            if(b.getId()==id)
            {
                b.setEmail_id(employee.getEmail_id());
                b.setPhone_no(employee.getPhone_no());
            }
            return b;
        }).collect(Collectors.toList());
    }*/
}