package com.dairy.drm.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private int employeeId;

    @Column(name = "name")
    private String name;

    //@ManyToOne
    //@Column(name = "farm_id")



    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @ManyToOne
    @JoinColumn(name = "farm_id")
    private DairyFarm dairyFarm;

/*

    private ArrayList<Contact>  employeeContacts;
    private ArrayList<Picture>  employeePictures; */

    public int getEmployeeId() { return employeeId; }

    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getFarmId() {
        return dairyFarm.getFarmId();
    }

    public Date getStartDate() { return startDate; }

    public void setStartDate(Date startDate) { this.startDate = startDate; }

    public Date getEndDate() { return endDate; }

    public void setEndDate(Date endDate) { this.endDate = endDate; }
/*
   public DairyFarm getDairyFarm() {
        return dairyFarm;
    }

    public void setDairyFarm(DairyFarm dairyFarm) {
        this.dairyFarm = dairyFarm;
    }
    */


}
