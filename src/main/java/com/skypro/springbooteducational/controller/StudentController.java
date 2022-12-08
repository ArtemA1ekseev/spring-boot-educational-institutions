package com.skypro.springbooteducational.controller;

import com.skypro.springbooteducational.model.Student;
import com.skypro.springbooteducational.service.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

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
    public Student getById(@PathVariable("id") Long id) {
        return this.studentService.findStudent(id);
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return this.studentService.addStudent(student);
    }

    @PutMapping("/{id}")
    public Student editStudent(@PathVariable("id") Long id, @RequestBody Student student) {
        return this.studentService.editStudent(id, student);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable("id") Long id) {
        this.studentService.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/age/{age}")
    public Collection<Student> getStudentsByAge(@PathVariable("age") int age) {
        return this.studentService.getByAge(age);
    }
}
