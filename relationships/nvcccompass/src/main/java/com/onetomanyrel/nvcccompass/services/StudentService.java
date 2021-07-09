package com.onetomanyrel.nvcccompass.services;

import java.util.List;
import java.util.Optional;

import com.onetomanyrel.nvcccompass.models.Student;
import com.onetomanyrel.nvcccompass.repositories.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> studentList() {
        return studentRepository.findAll();
    }
    public Student getStudent(Long id) throws Exception {
        Optional<Student> compass = studentRepository.findById(id);
        if (compass == null){
            System.out.println("It is a null value: ");
            throw new Exception("Processing fail. Got a null response");
        }
        return compass.get();
    }
    
    public Student search(String firstName) {
        Student student = (Student) studentRepository.findByName(firstName);
        return student;
    }

    public Student destroy(Long id) {
        Student student = studentRepository.findById(id).get();
        if (student != null)
            studentRepository.delete(student);
        return student;
    }
    public Student updateStudent(Long id, Student student) {
        Student tmp = studentRepository.findById(id).get();
        tmp.setFirstName(student.getFirstName());
        tmp.setLastName(student.getLastName());
        return studentRepository.save(tmp);
    }

    public Student update(Student student) {
        return studentRepository.save(student);
    }
    public void create(Student student) {
        if (student.getFirstName().length() < 0 || student.getLastName().length() < 0 ) return;
        studentRepository.save(student);
    }

    
    
}
