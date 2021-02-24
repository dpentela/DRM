package com.dairy.drm.service;

import com.dairy.drm.dao.EmployeeDAO;
import com.dairy.drm.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeDAO employeeDAO;

    @Transactional
    @Override
    public List<Employee> get() {
        return employeeDAO.get();
    }

    @Transactional
    @Override
    public Employee get(int employeeId) {
        return employeeDAO.get(employeeId);
    }

    @Transactional
    @Override
    public void save(Employee employee) {
        employeeDAO.save(employee);
    }

    @Transactional
    @Override
    public void delete(int employeeId) {
        employeeDAO.delete(employeeId);

    }

    @Transactional
    @Override
    public List<Employee> getFarmEmployees(int farmId) {

        return (List<Employee>) employeeDAO.getFarmEmployees( farmId);
    }

     /* List<List<Object>> listOfLists = new ArrayList<>();
    JSONArray jsonArray = new JSONArray();
        for (List<Object> list : listOfLists) {
        JSONArray newArray = new JSONArray(list);
        jsonArray.put(newArray);
    }*/
   /* @Transactional
    @Override
    public List<List<Employee>> getFarmEmployee(){
        return (List<List<Employee>>) employeeDAO.getFarmEmployee();
    } */
}
