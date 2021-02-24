package com.dairy.drm.controller;

import com.dairy.drm.model.Employee;
import com.dairy.drm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

     @Autowired
    EmployeeService employeeService;


    @GetMapping("/employee")
    public List<Employee> get () {
          return  employeeService.get();

    }
    @GetMapping("/employee/{EmployeeId}")
    public Employee get(@PathVariable int EmployeeId) {
        return  employeeService.get(EmployeeId);

    }

    @GetMapping("/farmEmployee/{FarmId}")
    public List<Employee> getFarmEmployee(@PathVariable int FarmId) {

        return employeeService.getFarmEmployees(FarmId);
    }

    @PostMapping("/employee")
    public Employee save(@RequestBody Employee employee) {
        employeeService.save(employee);
        return employee;
    }


    @PutMapping("/employee")
    public Employee update(@RequestBody Employee employee) {
        employeeService.save(employee);
        return employee;
    }

    @DeleteMapping("/employee/{EmployeeId}")
    public String delete(@PathVariable int EmployeeId) {

        employeeService.delete(EmployeeId);

        return "Employee removed with id "+ EmployeeId;

    }

/*
    @Autowired
    com.dairy.drm.service.EmployeeService employeeService;
    @GetMapping("/employees")
    public List<Employee> getter () {
        return  employeeService.get();

    }
*/


}



