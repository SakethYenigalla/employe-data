package com.example.employedata.employee;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.annotation.Nonnull;
@Entity

public class Employe {
    @Id
    @GeneratedValue
    private int id;
    @Nonnull
    private String name;
    @Nonnull
    private String email;
    public Employe(){

    }
    public Employe(String name, String email){
        this.name= name;
        this.email=email;
    }
    public String toString(){
        return "Employe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Email=" + email +
                '}';
    }

    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
}
