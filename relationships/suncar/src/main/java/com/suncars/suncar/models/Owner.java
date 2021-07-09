package com.suncars.suncar.models;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Owner {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long ownerid;
    private String firstname, lastname;

    public Owner() {}

    public Owner(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private List<Car> cars;

    public List<Car> getCars() {
        return this.cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
    public void addACar(Car car) {
        this.cars.add(car);
    }
    /*
        Owner owner1 = new Owner();
        owner1.cars.add(new Car());
    */



    public Long getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(Long ownerid) {
        this.ownerid = ownerid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}