package com.example.employedata.service;

import com.example.employedata.employee.Employe;
import com.example.employedata.repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component

public class DataInitilizer implements CommandLineRunner {
    private final EmployeRepository employeeRepository;
    @Autowired
    public DataInitilizer(EmployeRepository employeeRepository){
        this.employeeRepository=employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        int count= 50;
        for(int i=0; i<=count;i++){
            Employe emp=new Employe();
            emp.setName("Saketh"+i);
            emp.setEmail("saketh"+i+"@gmail.com");
            employeeRepository.save(emp);
        }
    }
}
