package com.summer.summercourse.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.summer.summercourse.models.Course;
import com.summer.summercourse.models.Student;
import com.summer.summercourse.models.StudentCourseLink;
import com.summer.summercourse.repositories.CourseRepo;
import com.summer.summercourse.repositories.StudentRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api", method = RequestMethod.GET)
public class HomeController {
    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private CourseRepo courseRepo;
    // @Autowired
    // private StudentCourseLink studentCourseLink;

    @GetMapping("/home/students")
    public ResponseEntity<List<Student>> allStudents() {
        List<Student> students = studentRepo.findAll();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }
    @GetMapping("/home/courses")
    public ResponseEntity<List<Course>> allCourses() {
        List<Course> courses = courseRepo.findAll();
        return new ResponseEntity<>(courses, HttpStatus.OK);
    }
    
    @PostMapping("/new/student")
    public ResponseEntity<Student> createStudent(@RequestBody Student newStudent) {
        studentRepo.save(newStudent);
        return new ResponseEntity<Student>(newStudent, HttpStatus.CREATED); 
    }
    @PostMapping("/new/course")
    public ResponseEntity<Course> createCourse(@RequestBody Course newCourse, HttpSession session) {
        // session.setAttribute("course_id", value);
        courseRepo.save(newCourse);
        return new ResponseEntity<Course>(newCourse, HttpStatus.CREATED); 
    }
    @GetMapping("/new/course/{student_id}")
    public ResponseEntity<Course> createAndJoinCourse( @PathVariable("student_id") Long id) {
        Student student = studentRepo.findById(id).get();
        Course course = courseRepo.findById(id).get();
        System.out.println(student.getFirstName() + " " + course.getCourseName());
        
        return new ResponseEntity<Course>(course, HttpStatus.OK); 
    }

    @PostMapping("/join/course/{id}")
    public ResponseEntity<Course> joinCourse(@PathVariable("id") Long id, HttpSession session) {
        Student student = studentRepo.findById(id).get();
        // System.out.println(student.getId());
        Long courseId = 1l;
        Course course = courseRepo.findById(courseId).get();
        // StudentCourseLink link = new StudentCourseLink();
        // link.setCourse(course);
        // link.setStudent(student);
        course.getStudents().add(student);
        courseRepo.save(course);

        
        return new ResponseEntity<Course>(HttpStatus.OK); 
    }

    @PostMapping("/join/new-course/{id}")
    public ResponseEntity<Course> joinCourse(@PathVariable("id") Long id, HttpSession session, @RequestBody Course newCourse) {
        Student student = studentRepo.findById(id).get();
        // System.out.println(student.getId());
        Course course = courseRepo.save(newCourse);
        // Course course = courseRepo.findById(courseId).get();
        // StudentCourseLink link = new StudentCourseLink();
        // link.setCourse(course);
        // link.setStudent(student);
        student.getCourses().add(course);
        // studentRepo.save(student);
        // course.getStudents().add(student);
        courseRepo.save(course);

        
        return new ResponseEntity<Course>(newCourse, HttpStatus.OK); 
    }

}
