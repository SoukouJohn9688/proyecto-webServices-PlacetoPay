package com.SpringPrueba.Prueba.controladores;


import com.SpringPrueba.Prueba.entidades.Employee;
import com.SpringPrueba.Prueba.repositorios.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/saveEmployee")
    private String saveEmployee(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return " The employee by the name: "+employee.getName()+" has been saved for good!";
    }

    @GetMapping("/list")
    private List<Employee> listEmployee(){
        return employeeRepository.findAll();
    }

    @GetMapping("/findEmployee/{id}")
    private Optional<Employee> displayEmployeeById(@PathVariable Integer id){
        return employeeRepository.findById(id);
    }

    @GetMapping("/findEmployeedep/{dept}")
    private List<Employee> displayEmployeeById(@PathVariable String dept){
        return employeeRepository.findByDept(dept);
    }

}
