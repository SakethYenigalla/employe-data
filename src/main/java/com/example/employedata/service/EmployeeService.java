package com.example.employedata.service;

import com.example.employedata.employee.Employee;
import com.example.employedata.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployeeDetails() {
        return (List<Employee>) employeeRepository.findAll();
    }

    public Optional<Employee> getById(String id) {
        return employeeRepository.findById(id);
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteById(String id) {
        employeeRepository.deleteById(id);
    }
}
