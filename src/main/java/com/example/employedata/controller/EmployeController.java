package com.example.employedata.controller;

import com.example.employedata.employee.Employe;
import com.example.employedata.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Employed/Data")
public class EmployeController {

    private final EmployeService employeService;
    @Autowired
    public EmployeController(EmployeService employeService){
        this.employeService=employeService;
    }
    @GetMapping("/All")
    public List<Employe> getEmployeData(){
        return (List<Employe>) employeService.getAllEmployeDetails();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Employe> getById(@PathVariable Integer id){
        Optional<Employe> employe= employeService.getById(id);
        return employe.map(ResponseEntity::ok)
                .orElseGet(()->ResponseEntity.notFound().build());
    }
    @PostMapping
    public String saveEmploye(@RequestBody Employe employe){
        employeService.saveEmploye(employe);
        return "Employe saved..";
    }
    @DeleteMapping("/{id}")
    public void deleteEmploye(@PathVariable Integer id){
        employeService.deleteById(id);
    }
}
