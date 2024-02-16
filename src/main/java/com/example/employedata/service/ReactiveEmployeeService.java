package com.example.employedata.service;

import com.example.employedata.employee.Employee;
import com.example.employedata.repository.ReactiveEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ReactiveEmployeeService {

    private ReactiveEmployeeRepository reactiveEmployeeRepository;

    @Autowired
    public ReactiveEmployeeService(ReactiveEmployeeRepository reactiveEmployeeRepository) {
        this.reactiveEmployeeRepository = reactiveEmployeeRepository;
    }

    public Flux<Employee> getAllEmployee() {
        return reactiveEmployeeRepository.findAll();
    }

    public Mono<Employee> getById(String id) {
        return reactiveEmployeeRepository.findById(id);
    }

    public Mono<Employee> saveEmployee(Employee employee) {
        return reactiveEmployeeRepository.save(employee);
    }

    public Mono<Void> deleteEmployeeById(String id) {
        return reactiveEmployeeRepository.deleteById(id);
    }
}
