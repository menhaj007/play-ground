package com.summer.summercourse.services;

import com.summer.summercourse.models.Course;
import com.summer.summercourse.models.Student;
import com.summer.summercourse.models.StudentCourseLink;
import com.summer.summercourse.repositories.CourseRepo;
import com.summer.summercourse.repositories.StudentCourseLinkRepo;
import com.summer.summercourse.repositories.StudentRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SCService {
    @Autowired
    StudentCourseLinkRepo sRepo;
    @Autowired
    CourseRepo courseRepo;
    @Autowired
    StudentRepo studentRepo;

    public StudentCourseLink link(Long studentId, Long courseId) {
        StudentCourseLink scl = new StudentCourseLink();
        Student s = studentRepo.findById(studentId).get();
        Course c = courseRepo.findById(courseId).get();
        scl.setStudent(s);
        scl.setCourse(c);
        sRepo.save(scl);
        return scl;
    }
    
}
