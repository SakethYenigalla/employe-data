package com.example.employedata.service;

import com.example.employedata.employee.Employe;
import com.example.employedata.repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EmployeService {

    private final EmployeRepository employeRepository;
    @Autowired
    public EmployeService(EmployeRepository employeRepository){
        this.employeRepository=employeRepository;
    }
        public List<Employe> getAllEmployeDetails(){
            return (List<Employe>) employeRepository.findAll();
        }
        public Optional<Employe> getById(Integer id){
            return  employeRepository.findById(id);
        }
        public Employe saveEmploye(Employe employe){
           return employeRepository.save(employe);
        }
        public void deleteById(Integer id){
           employeRepository.deleteById(id);
        }
}
