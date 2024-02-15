package com.example.employedata.controller;

import com.example.employedata.employee.Employee;
import com.example.employedata.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Employed/Data")
public class EmployeeController {

    private final EmployeeService employeeService;
    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }
    @GetMapping("/All")
    public List<Employee> getEmployeeData(){
        return (List<Employee>) employeeService.getAllEmployeeDetails();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Employee> getById(@PathVariable String id){
        Optional<Employee> employee= employeeService.getById(id);
        return employee.map(ResponseEntity::ok)
                .orElseGet(()->ResponseEntity.notFound().build());
    }
    @PostMapping
    public ResponseEntity<String> saveEmployee(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
        return ResponseEntity.status(HttpStatus.OK).body("Employee saved..");
    }
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable String id){
        employeeService.deleteById(id);
    }
}
