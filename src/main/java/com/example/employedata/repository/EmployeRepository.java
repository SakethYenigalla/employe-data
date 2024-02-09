package com.example.employedata.repository;

import com.example.employedata.employee.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository<Employe, Integer> {

}
