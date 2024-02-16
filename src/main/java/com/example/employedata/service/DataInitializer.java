package com.example.employedata.service;

import com.example.employedata.employee.Employee;
import com.example.employedata.repository.ReactiveEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.Random;
import java.util.UUID;

@Component
public class DataInitializer implements CommandLineRunner {
    //    private final EmployeeRepository employeeRepository;
    private final ReactiveEmployeeRepository reactiveEmployeeRepository;

    @Autowired
    public DataInitializer(ReactiveEmployeeRepository reactiveEmployeeRepository) {
//        this.employeeRepository=employeeRepository;
        this.reactiveEmployeeRepository = reactiveEmployeeRepository;
    }

    @Override
    public void run(String... args) {
        int count = 50;
        for (int i = 1; i <= count; i++) {
            Employee emp = new Employee();

            Random random = new Random();
            int randomNumber = random.nextInt();
            UUID uuid = UUID.randomUUID();
            emp.setId(uuid.toString());

            emp.setName("s" + uuid);
            emp.setEmail(uuid + "." + randomNumber + "@gmail.com");
            Mono<Employee> save = reactiveEmployeeRepository.save(emp);
            System.out.println(save.block().getId());
            reactiveEmployeeRepository.findAll().toStream().forEach(System.out::println);
        }
    }
}
