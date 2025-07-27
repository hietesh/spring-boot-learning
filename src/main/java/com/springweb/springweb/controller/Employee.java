package com.springweb.springweb.controller;

import com.springweb.springweb.dto.EmployeeDTO;
import com.springweb.springweb.services.EmployeeService;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping(path = "/employee")
public class Employee {

    private final EmployeeService employeeService;

    Employee(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping(path="/{employeeId}")
    EmployeeDTO showEmployee(@PathVariable(name = "employeeId") Long id) {
        return employeeService.findEmployeeById(id);
    }

    @GetMapping
    public List<EmployeeDTO> getAllEmp() {
        return employeeService.getAllEmployee();
    }
    

    @PostMapping
    EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.createNewEmployee(employeeDTO); 
    }

}
