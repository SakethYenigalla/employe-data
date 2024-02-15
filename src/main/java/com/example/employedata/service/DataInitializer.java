//package com.example.employedata.service;
//
//import com.example.employedata.employee.Employe;
//import com.example.employedata.repository.EmployeRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.Random;
//import java.util.UUID;
//
//@Component
//
//public class DataInitializer implements CommandLineRunner {
//    private final EmployeRepository employeeRepository;
//    @Autowired
//    public DataInitializer(EmployeRepository employeeRepository){
//        this.employeeRepository=employeeRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        int count= 50;
//        for(int i=1; i<=count;i++){
//            Employe emp=new Employe();
//
//            Random random= new Random();
//            int randomNumber=random.nextInt();
//            UUID uuid=UUID.randomUUID();
//            emp.setId(uuid.toString());
//
//            emp.setName("s"+uuid);
//            emp.setEmail(uuid+"."+ randomNumber+"@gmail.com");
//            employeeRepository.save(emp);
//        }
//    }
//}
