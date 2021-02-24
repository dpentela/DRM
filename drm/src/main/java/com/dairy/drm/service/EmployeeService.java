package com.dairy.drm.service;

import com.dairy.drm.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> get();

    Employee get(int employeeId);

    void save(Employee employee);

    void delete(int employeeId);

    List<Employee> getFarmEmployees(int farmId);

   /* List<List<Employee>> getFarmEmployee(); */

}
