package com.example.crudWithMongo.controller;

import com.example.crudWithMongo.model.Employee;
import com.example.crudWithMongo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public String createEmployee(@RequestBody Employee emp){
    return employeeService.createEmployee(emp);
    }

    @GetMapping("/getAllEmp")
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> getEmp(){
        return employeeService.getAllEmp();
    }

    @GetMapping("/deleteEmp")
    @ResponseStatus(HttpStatus.OK)
    public String getEmp(@RequestParam String id){
        return employeeService.deleteEmp(id);
    }

    @PutMapping("/updateEmp")
    @ResponseStatus(HttpStatus.OK)
    public String updateEmp(@RequestBody Employee emp){
        return employeeService.updateEmp(emp);
    }

    @GetMapping("/getEmpById")
    public Employee getEmpById(@RequestParam String id){
        return employeeService.getEmpById(id);
    }
}

