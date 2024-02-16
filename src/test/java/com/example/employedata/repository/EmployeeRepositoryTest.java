package com.example.employedata.repository;

//import com.example.employedata.employee.Employee;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//
//import java.util.Arrays;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//@DataJpaTest
//
//class EmployeeRepositoryTest {
//    @Autowired
//    private EmployeeRepository employeeRepository;
//    @Autowired
//    private TestEntityManager entityManager;
//    @BeforeEach
//    void setup(){
//        Employee employee=new Employee("1","saketh","saketh1");
//        entityManager.persist(employee);
//    }
//    @Test
//    public void testById(){
//        Employee employee= employeeRepository.getById("1");
//        assertEquals("saketh", employee.getName());
//    }
//    @Test
//    public void testSaveEmployee(){
//        Employee employee = employeeRepository.save(new Employee("2","sakethsai","saketh2"));
//        employeeRepository.save(employee);
//       assertEquals("sakethsai", employee.getName());
//    }
//    @Test
//    public void testAllEmployeeData(){
//        List<Employee> employees = Arrays.asList(new Employee("1","saketh","saketh1"), new Employee("2","ravi","ravi2"));
//        employeeRepository.findAll();
//        assertEquals(2, employees.size());
//    }
//
//}