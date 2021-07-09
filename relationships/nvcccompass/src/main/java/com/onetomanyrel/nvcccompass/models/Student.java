package com.onetomanyrel.nvcccompass.models;


import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;


@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(min=1, max=255, message = "Between 1 and 255 characters")
    private String firstName;
    
    @Size(min=1, max=255, message = "Between 1 and 255 characters")
    private String lastName;
    private int age;

    @Column(updatable=false)
    private Date createdAt = new Date();
    private Date updatedAt = new Date();
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="nvcc_id")
    private NVCC nvcc;
    
    public Student() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public NVCC getNvcc() {
        return this.nvcc;
    }

    public void setNvcc(NVCC nvcc) {
        this.nvcc = nvcc;
    }
    
}

