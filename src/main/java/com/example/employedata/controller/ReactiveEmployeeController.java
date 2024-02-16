package com.example.employedata.controller;

import com.example.employedata.employee.Employee;
import com.example.employedata.service.ReactiveEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/Reactive")

public class ReactiveEmployeeController {

    private ReactiveEmployeeService reactiveEmployeeService;

    @Autowired
    public ReactiveEmployeeController(ReactiveEmployeeService reactiveEmployeeService) {
        this.reactiveEmployeeService = reactiveEmployeeService;
    }

    @GetMapping("/All")
    public Flux<Employee> getAllData() {
        return reactiveEmployeeService.getAllEmployee();
    }

    @GetMapping("/{id}")
    public Mono<Employee> getById(@PathVariable String id) {
        return reactiveEmployeeService.getById(id);
    }

    @PostMapping("/save")
    public Mono<Employee> saveEmployee(@RequestBody Employee employee) {
        return reactiveEmployeeService.saveEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteEmployee(String id) {
        return reactiveEmployeeService.deleteEmployeeById(id);
    }
}
