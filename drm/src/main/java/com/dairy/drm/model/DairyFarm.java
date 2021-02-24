package com.dairy.drm.model;

import com.fasterxml.jackson.core.JsonEncoding;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name="dairy_farm")
public class DairyFarm {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "farm_id")
    private int farmId;

    @Column(name = "name")
    private String name;

    @Column(name = "no_of_workers")
    private int noOfWorkers;

    @Column(name = "farm_size")
    private int farmSize;

    @Column(name = "cows")
    private int cows;

    @Column(name = "buffaloes")
    private int buffaloes;

    @Column(name = "heifers")
    private int heifers;

    @Column(name = "cow_mlk")
    private int cowMilk;

    @Column(name = "buffalo_milk")
    private int buffaloMilk;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")

    private String password;



    @OneToMany(cascade=CascadeType.ALL, mappedBy="dairyFarm", targetEntity=com.dairy.drm.model.Employee.class)
    private Set<Employee> farmEmployees = new HashSet<>();

  //  private ArrayList<Contact> farmContacts;

    //private ArrayList<Employee> farmEmployees;

   // private ArrayList<Picture>  farmPictures;

    public int getFarmId() {
        return farmId;
    }

    public void setFarmId(int farmId) {
        this.farmId = farmId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfWorkers() {
        return noOfWorkers;
    }

    public void setNoOfWorkers(int noOfWorkers) {
        this.noOfWorkers = noOfWorkers;
    }

    public int getFarmSize() {
        return farmSize;
    }

    public void setFarmSize(int farmSize) {
        this.farmSize = farmSize;
    }

    public int getCows() {
        return cows;
    }

    public void setCows(int cows) {
        this.cows = cows;
    }

    public int getBuffaloes() {
        return buffaloes;
    }

    public void setBuffaloes(int buffaloes) {
        this.buffaloes = buffaloes;
    }

    public int getHeifers() {
        return heifers;
    }

    public void setHeifers(int heifers) {
        this.heifers = heifers;
    }

    public int getCowMilk() {
        return cowMilk;
    }

    public void setCowMilk(int cowMilk) {
        this.cowMilk = cowMilk;
    }

    public int getBuffaloMilk() {
        return buffaloMilk;
    }

    public void setBuffaloMilk(int buffaloMilk) {
        this.buffaloMilk = buffaloMilk;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Employee> getFarmEmployees() {
        return farmEmployees;
    }

    public void setFarmEmployees(Set<Employee> farmEmployees) {
        this.farmEmployees = farmEmployees;
    }

}
