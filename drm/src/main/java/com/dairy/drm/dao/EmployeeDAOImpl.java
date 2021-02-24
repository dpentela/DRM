package com.dairy.drm.dao;

import com.dairy.drm.model.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> get() {
        Session currSession = entityManager.unwrap(Session.class);
        Query<Employee> query = currSession.createQuery("from Employee", Employee.class);
        List<Employee> list = query.getResultList();
        return list;

    }

    @Override
    public Employee get(int employeeId) {
        Session currSession = entityManager.unwrap(Session.class);
        Employee emp = currSession.get(Employee.class, employeeId);
        return emp;
    }

    @Override
    public List<Employee> getFarmEmployees(int farmId) {
        Session currSession = entityManager.unwrap(Session.class);
        Query<Employee> query = currSession.createQuery("from Employee where farm_id = :farmId").setParameter("farmId", farmId);
        List<Employee> list = query.getResultList();
        return list;
    }

    @Override
    public void save(Employee employee) {
        Session currSession = entityManager.unwrap(Session.class);
        currSession.saveOrUpdate(employee);

    }

    @Override
    public void delete(int employeeId) {
        Session currSession = entityManager.unwrap(Session.class);
        Employee emp = currSession.get(Employee.class, employeeId);
        currSession.delete(emp);

    }


    }
/* Session currSession = entityManager.unwrap(Session.class);
        Query<DairyFarm> query = currSession.createQuery("from DairyFarm", DairyFarm.class);
        List<DairyFarm> list = query.getResultList();
        return list;*/

