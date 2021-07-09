package com.summer.summercourse.repositories;

import java.util.List;
import java.util.Optional;

import com.summer.summercourse.models.Course;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends CrudRepository<Course, Long> {
    // Course findCourseByName(String courseName);
    Optional<Course> findById(Long id);

    List<Course> findAll();
    
}
