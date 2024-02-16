package com.example.employedata.employee;

import jakarta.annotation.Nonnull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

@Document
public class Employee {
    @Id
    private String id;
    @Nonnull
    private String name;
    @Nonnull
    private String email;

    public Employee() {

    }

    public Employee(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Email=" + email +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Mono<ResponseEntity<String>> map(Object employeeSaved) {
        return null;
    }

}
