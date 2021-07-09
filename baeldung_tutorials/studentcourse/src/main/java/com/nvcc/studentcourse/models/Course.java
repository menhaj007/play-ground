package com.nvcc.studentcourse.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(mappedBy = "likedCourses")
    Set<Student> likes;



    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Course() {

    }
    

    public Set<Student> getLikes() {
        return this.likes;
    }

    public void setLikes(Set<Student> likes) {
        this.likes = likes;
    }
    
}
