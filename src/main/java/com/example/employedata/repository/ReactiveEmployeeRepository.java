package com.example.employedata.repository;

import com.example.employedata.employee.Employee;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ReactiveEmployeeRepository extends ReactiveMongoRepository<Employee,String> {
}
