package com.summer.summercourse.repositories;

import com.summer.summercourse.models.StudentCourseLink;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentCourseLinkRepo extends CrudRepository<StudentCourseLink, Long> {
    
}
