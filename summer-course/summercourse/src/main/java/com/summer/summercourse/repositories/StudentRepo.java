package com.summer.summercourse.repositories;

import java.util.List;
import java.util.Optional;

import com.summer.summercourse.models.Student;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends CrudRepository<Student, Long> {
    List<Student> findAll();
    Optional<Student> findById(Long id);
    // Student findByFirstNameAndLastName(String firstName, String lastName);
}
