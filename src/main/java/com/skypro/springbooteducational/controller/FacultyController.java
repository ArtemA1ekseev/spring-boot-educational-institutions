package com.skypro.springbooteducational.controller;

import com.skypro.springbooteducational.model.Faculty;
import com.skypro.springbooteducational.service.FacultyService;
import org.springframework.http.HttpStatus;
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
    public ResponseEntity<Faculty> getById(@PathVariable("id") Long id) {
        Faculty faculty = this.facultyService.findFaculty(id);
        if (faculty == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(faculty);
    }

    @PostMapping
    public ResponseEntity<Faculty> createFaculty(@RequestBody Faculty faculty) {
        return ResponseEntity.ok(this.facultyService.addFaculty(faculty));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Faculty> editFaculty(@PathVariable("id") Long id, @RequestBody Faculty faculty) {
        Faculty foundFaculty = this.facultyService.editFaculty(id, faculty);
        if (foundFaculty == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.ok(foundFaculty);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFaculty(@PathVariable Long id) {
        this.facultyService.deleteFaculty(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<Collection<Faculty>> getAllFaculty() {
        return ResponseEntity.ok(this.facultyService.getAllFaculties());
    }

    @GetMapping("/color/{color}")
    public ResponseEntity<Collection<Faculty>> getFacultyByColor(@PathVariable("color") String color) {
        return ResponseEntity.ok(this.facultyService.findByColor(color));
    }

    @GetMapping("/filter")
    public ResponseEntity<Collection<Faculty>> findFaculty(@RequestParam(required = false) String name,
                                                           @RequestParam(required = false) String color) {
        return ResponseEntity.ok(this.facultyService.findFacultyByNameIgnoreCaseOrColorIgnoreCase(name, color));
    }

    @GetMapping("filter/theLongestName")
    public ResponseEntity<String> getFacultyByColor() {
        return ResponseEntity.ok(this.facultyService.getTheLongestNameFaculty());
    }
}