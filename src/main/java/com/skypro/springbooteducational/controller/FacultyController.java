package com.skypro.springbooteducational.controller;

import com.skypro.springbooteducational.model.Faculty;
import com.skypro.springbooteducational.service.FacultyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/faculty")
public class FacultyController {

    private final FacultyService facultyService;

    public FacultyController(FacultyService facultyService) {
        this.facultyService = facultyService;
    }

    @GetMapping("/{id}")
    public Faculty getById(@PathVariable("id") Long id) {
        return this.facultyService.findFaculty(id);
    }

    @PostMapping
    public Faculty createFaculty(@RequestBody Faculty faculty) {
        return this.facultyService.addFaculty(faculty);
    }

    @PutMapping("/{id}")
    public Faculty editFaculty(@PathVariable("id") Long id, @RequestBody Faculty faculty) {
        return this.facultyService.editFaculty(id, faculty);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFaculty(@PathVariable Long id) {
        this.facultyService.deleteFaculty(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/color/{color}")
    public Collection<Faculty> getStudentsByAge(@PathVariable("color") String color) {
        return this.facultyService.findByColor(color);
    }
}