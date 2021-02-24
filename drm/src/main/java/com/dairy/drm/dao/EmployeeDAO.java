package com.dairy.drm.dao;

import com.dairy.drm.model.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> get();

    Employee get(int employeeId);

    List<Employee> getFarmEmployees(int farmId);

    void save(Employee employee);

    void delete(int employeeId);

    //List<List<Employee>> getFarmEmployee();
}
