package com.skypro.springbooteducational.service;

import java.util.*;

import com.skypro.springbooteducational.model.Student;
import com.skypro.springbooteducational.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    private final static Logger logger = LoggerFactory.getLogger(StudentService.class);

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student addStudent(Student student) {
        logger.debug("addStudent method is in progress");
        return this.studentRepository.save(student);
    }

    public Student editStudent(Long id, Student student) {
        logger.debug("editStudent method is in progress");
        return this.studentRepository.save(student);
    }

    public Student findStudent(Long id) {
        logger.debug("findStudent method is in progress");
        return this.studentRepository.findById(id).get();
    }

    public void deleteStudent(Long id) {
        logger.debug("deleteStudent method is in progress");
        this.studentRepository.deleteById(id);
    }

    public Collection<Student> getAllStudents() {
        logger.debug("getAllStudents method is in progress");
        return this.studentRepository.findAll();
    }

    public Collection<Student> findByAge(int age) {
        logger.debug("findByAge method is in progress");
        return this.studentRepository.findByAge(age);
    }

    public Collection<Student> findByAgeBetween(int minAge, int maxAge) {
        logger.debug("findByAgeBetween method is in progress");
        return this.studentRepository.findByAgeBetween(minAge, maxAge);
    }

    public int getAllStudentsSql(){
        logger.debug("getAllStudentsSql method is in progress");
        return this.studentRepository.getAllStudentsSql();
    }

    public float getAvgAgeStudents(){
        logger.debug("getAvgAgeStudents method is in progress");
        return this.studentRepository.getAvgAgeStudents();
    }

    public List<Student> getLast5Students(){
        logger.debug("getLast5Students method is in progress");
        return this.studentRepository.getLast5Students();
    }
}