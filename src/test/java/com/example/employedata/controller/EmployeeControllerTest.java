package com.example.employedata.controller;

//import com.example.employedata.employee.Employee;
//import com.example.employedata.service.EmployeeService;
//import org.hamcrest.Matchers;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.ResultMatcher;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Optional;
//
//@WebMvcTest(EmployeeController.class)
//class EmployeeControllerTest {
//    @MockBean
//    private EmployeeService employeeService;
//    @InjectMocks
//    private EmployeeController employeeController;
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Test
//    void getEmployeData() throws Exception {
//        List<Employee> employeeList = Arrays.asList(new Employee("12","ssadf","fagrgr@rg.com"),new Employee("23","ferre","fergs@dnj.com"));
//        Mockito.when(employeeService.getAllEmployeeDetails()).thenReturn(employeeList);
//        mockMvc.perform(MockMvcRequestBuilders.get("/Employed/Data/All"))
//                .andExpect(MockMvcResultMatchers.status().isOk())
////                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON))
//                .andExpect((ResultMatcher) MockMvcResultMatchers.jsonPath("$[0].id", Matchers.is("12")))
//                .andExpect((ResultMatcher) MockMvcResultMatchers.jsonPath("[0].name",Matchers.is("ssadf")))
//                .andExpect((ResultMatcher) MockMvcResultMatchers.jsonPath("[0].email",Matchers.is("fagrgr@rg.com")));
//
//
//    }
//
//    @Test
//    void getById() throws Exception {
//        Employee employee = new Employee("22", "Saketh", "saketh@gmail.com");
//        Mockito.when(employeeService.getById("22")).thenReturn(Optional.of(employee));
//        mockMvc.perform(MockMvcRequestBuilders.get("/Employed/Data/{id}","22"))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value("22"))
//                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("Saketh"))
//                .andExpect(MockMvcResultMatchers.jsonPath("$.email").value("saketh@gmail.com"));
//    }
//
//    @Test
//    void saveEmploye() throws Exception {
//        Employee employee = new Employee("22", "Saketh", "saketh@gmail.com");
////        Mockito.when(employeService.saveEmploye(employee)).thenReturn(employee);
//        mockMvc.perform(MockMvcRequestBuilders.post("/Employed/Data")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content("{\"id\":\"22\",\"name\":\"Saketh\",\"email\":\"saketh@gmail.com\"}"))
//                        .andExpect(MockMvcResultMatchers.status().isOk());
//
////        Mockito.verify(employeeService, Mockito.times(1)).saveEmployee(employee);
//    }
//
//    @Test
//    void deleteEmploye() throws Exception {
//        Employee employee = new Employee("22", "Saketh", "saketh@gmail.com");
//        Mockito.doNothing().when(employeeService).deleteById("22");
//        mockMvc.perform(MockMvcRequestBuilders.delete("/Employed/Data/{id}","22"))
//                .andExpect(MockMvcResultMatchers.status().isOk());
//
//        Mockito.verify(employeeService, Mockito.times(1)).deleteById("22");
//    }
//}