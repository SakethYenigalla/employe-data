package com.example.employedata.service;

import com.example.employedata.employee.Employee;
import com.example.employedata.repository.EmployeeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest

class EmployeeServiceTest {
    @Autowired
    private EmployeeService employeeService;
    @MockBean
    private EmployeeRepository employeeRepository;

    @BeforeEach
    void setUp() {
        List<Employee> employee= Arrays.asList(new Employee("1","saketh","saketh1"), new Employee("2","ravi","ravi2"));
        Mockito.when(employeeRepository.findAll()).thenReturn(employee);
    }

    @Test
    void getAllEmployeeDetails() {
        List<Employee> employeeList = Arrays.asList(new Employee("1","saketh","saketh1"), new Employee("2","ravi","ravi2"));
        Mockito.when(employeeRepository.findAll()).thenReturn(employeeList);
        List<Employee> serviceEmployee=employeeService.getAllEmployeeDetails();
        assertEquals(employeeList, serviceEmployee);
        Mockito.verify(employeeRepository).findAll();
    }

    @Test
    void getById() {
        Optional<Employee> employee= Optional.of(new Employee("1","saketh","saketh1"));
        Mockito.when(employeeRepository.findById("1")).thenReturn(employee);
        String employeName="saketh";
        Optional<Employee> employee1=employeeService.getById("1");
        assertEquals(employeName,employee1.get().getName());
    }

    @Test
    void saveEmployee() {
        Employee employee=new Employee("1","saketh","saketh1");
        Mockito.when(employeeRepository.save(employee)).thenReturn(employee);
        employeeService.saveEmployee(employee);
        Mockito.verify(employeeRepository, Mockito.times(1)).save(employee);


    }

    @Test
    void deleteById() {
        Employee employee=new Employee("1","saketh","saketh1");
        Mockito.doNothing().when(employeeRepository).deleteById("1");
       employeeService.deleteById("1");
        Mockito.verify(employeeRepository, Mockito.times(1)).deleteById("1");
    }
}