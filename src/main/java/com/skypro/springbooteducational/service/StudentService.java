package com.skypro.springbooteducational.service;

import java.util.*;
import java.util.stream.Collectors;

import com.skypro.springbooteducational.exception.StudentNotFoundException;
import com.skypro.springbooteducational.model.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private long count = 0L;
    private final Map<Long, Student> students = new HashMap<>();

    public Student addStudent(Student student) {
        long newId = this.count++;
        student.setId(newId);
        students.put(newId, student);
        return student;
    }

    public Student editStudent(Long id, Student student) {
        if (this.students.containsKey(id)) {
            Student oldStudent = this.students.get(id);
            oldStudent.setAge(student.getAge());
            oldStudent.setName(student.getName());
            return oldStudent;
        } else {
            throw new StudentNotFoundException();
        }
    }

    public Student findStudent(Long id) {
        if (this.students.containsKey(id)) {
            return this.students.get(id);
        } else {
            throw new StudentNotFoundException();
        }
    }

    public void deleteStudent(Long id) {
        if (this.students.containsKey(id)) {
            this.students.remove(id);
        } else {
            throw new StudentNotFoundException();
        }
    }

    public Collection<Student> getAllStudents() {
        return this.students.values();
    }

    public Collection<Student> getByAge(int age) {
        return this.students.values().stream()
                .filter(s -> s.getAge() == age)
                .collect(Collectors.toList());
    }
}