package com.javatechie.azure.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeResource {
    @Autowired
    private EmployeeRepository employeeRepo;

    @GetMapping("/test")
    public String GetTest(){
        return "Hello World";
    }
    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee) {
        return (Employee)this.employeeRepo.save(employee);
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return this.employeeRepo.findAll();
    }
}
