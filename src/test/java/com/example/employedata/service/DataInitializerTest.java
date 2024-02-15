package com.example.employedata.service;

import com.example.employedata.employee.Employee;
import com.example.employedata.repository.EmployeeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

class DataInitializerTest {
    @Mock
    private EmployeeRepository employeeRepository;
//    @InjectMocks
//    private DataInitializer dataInitializer;
    @BeforeEach
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }
    @Test
    void ifItHitsRepositoryOrNot() throws Exception {
        when(employeeRepository.save(any(Employee.class))).thenReturn(null);
//       dataInitializer.run();
        verify(employeeRepository, times(50)).save(any(Employee.class));

    }

}