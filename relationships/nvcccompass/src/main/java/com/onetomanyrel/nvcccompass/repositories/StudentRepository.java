package com.onetomanyrel.nvcccompass.repositories;

import java.util.List;
import java.util.Optional;

import com.onetomanyrel.nvcccompass.models.Student;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    List<Student> findAll();
    Optional<Student> findById(Long id);
    List<Student> findByFirstNameContaining(String firstName);
    List<Student> findByLastNameContaining(String lastName);
    
}
