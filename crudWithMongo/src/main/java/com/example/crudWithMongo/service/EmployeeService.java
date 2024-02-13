package com.example.crudWithMongo.service;

import com.example.crudWithMongo.model.Employee;
import com.example.crudWithMongo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    public String createEmployee(Employee emp){
        try {
            employeeRepository.save(emp);
            return "Emp created successfully";
        }catch (Exception e){
            return "Emp not created";
        }
    }

    public List<Employee> getAllEmp(){
        return employeeRepository.findAll();
    }

    public String deleteEmp(String id){
        try{
            employeeRepository.deleteById(id);
            return "Emp deleted successfully";
        }catch (Exception e){
            return "Emp not deleted";
        }
    }

    public String updateEmp(Employee emp){
        try{
            employeeRepository.save(emp);
            return "Emp updated successfully";
        }catch (Exception e){
            return "Emp not updated";
        }
    }

    public Employee getEmpById(String id) {
        return employeeRepository.findById(id).get();
    }

}
