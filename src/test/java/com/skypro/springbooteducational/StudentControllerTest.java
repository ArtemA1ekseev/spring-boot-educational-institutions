package com.skypro.springbooteducational;

import com.skypro.springbooteducational.model.Student;
import com.skypro.springbooteducational.service.StudentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentControllerTest {
    /*
    private StudentService studentService = new StudentService();

    @BeforeEach
    void setUp() {
        Student student1 = new Student(0L, "TestName1", 13);
        studentService.addStudent(student1);
        Student student2 = new Student(0L, "TestName2", 14);
        studentService.addStudent(student2);
        Student student3 = new Student(0L, "TestName3", 63);
        studentService.addStudent(student3);
        Student student4 = new Student(0L, "TestName4", 46);
        studentService.addStudent(student4);
        Student student5 = new Student(0L, "TestName5", 18);
        studentService.addStudent(student5);
    }

    @Test
    void createStudent() {
        Student student = new Student(0L, "TestName6", 19);
        studentService.addStudent(student);
        assertEquals(student, studentService.findStudent(student.getId()));
        assertEquals(studentService.getAllStudents().size(), 6);
    }

    @Test
    void deleteStudent() {
        assertEquals(studentService.getAllStudents().size(), 5);
        studentService.deleteStudent(1L);
        assertEquals(studentService.getAllStudents().size(), 4);
    }

    @Test
    void updateStudent() {
        Student student = new Student(0L, "TestName7", 21);
        studentService.editStudent(1L, student);
        assertEquals(student.getName(), "TestName7");
        assertEquals(student.getAge(), 21);
    }

    @Test
    void searchStudent() {
        Student student = studentService.findStudent(2L);
        assertEquals(student.getName(), "TestName3");
        assertEquals(student.getAge(), 63);
    }

    @Test
    void getAllStudent() {
        Collection<Student> collection = studentService.getAllStudents();
        assertEquals(collection.size(), 5);
    }

    @Test
    void getStudentsByAge() {
        Collection<Student> collection = studentService.getByAge(18);
        assertEquals(collection.size(), 1);
    }
    */
}
