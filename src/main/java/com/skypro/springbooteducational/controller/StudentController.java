package com.skypro.springbooteducational.controller;

import com.skypro.springbooteducational.model.Student;
import com.skypro.springbooteducational.service.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/{id}")
    @Operation(summary = "Returns a student by id",
                tags = "student")
    @ApiResponses(value = {@ApiResponse(responseCode = "404",
                                        description = "Student not found",
                                        content = @Content)})
    public ResponseEntity<Student> getById(@PathVariable("id") Long id) {
        Student student = this.studentService.findStudent(id);
        if (student == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(student);
    }

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        return ResponseEntity.ok(this.studentService.addStudent(student));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> editStudent(@PathVariable("id") Long id, @RequestBody Student student) {
        Student foundStudent = this.studentService.editStudent(id, student);
        if (foundStudent == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.ok(foundStudent);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable("id") Long id) {
        this.studentService.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<Collection<Student>> getAllStudent() {
        return ResponseEntity.ok(this.studentService.getAllStudents());
    }

    @GetMapping("/age/{age}")
    public ResponseEntity<Collection<Student>> getStudentsByAge(@PathVariable("age") int age) {
        return ResponseEntity.ok(this.studentService.findByAge(age));
    }

    @GetMapping("/between-age")
    public ResponseEntity<Collection<Student>> getStudentByAgeBetween(@RequestParam Integer minAge, @RequestParam Integer maxAge) {
        if (minAge != null && maxAge != null) {
            return ResponseEntity.ok(this.studentService.findByAgeBetween(minAge, maxAge));
        }
        return ResponseEntity.ok(this.studentService.getAllStudents());
    }

    @GetMapping("request/getAll")
    public ResponseEntity getAllStudentsSql() {
        return ResponseEntity.ok(this.studentService.getAllStudentsSql());
    }

    @GetMapping("request/getAvg")
    public ResponseEntity getAvgAgeStudents() {
        return ResponseEntity.ok(this.studentService.getAvgAgeStudents());
    }

    @GetMapping("request/getLast5")
    public ResponseEntity<List<Student>> getLast5Students() {
        return ResponseEntity.ok(this.studentService.getLast5Students());
    }

    @GetMapping("/nameWithA")
    public ResponseEntity<List<String>> getAllNamesStartWithA() {
        return ResponseEntity.ok(this.studentService.getAllNamesStartWithA());
    }

    @GetMapping("/getAverageAge")
    public ResponseEntity<Integer> getAvgAge() {
        return ResponseEntity.ok(this.studentService.getAvgAge());
    }
}