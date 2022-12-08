package com.skypro.springbooteducational.service;

import java.util.*;
import java.util.stream.Collectors;

import com.skypro.springbooteducational.exception.FacultyNotFoundException;
import com.skypro.springbooteducational.model.Faculty;
import org.springframework.stereotype.Service;

@Service
public class FacultyService {

    private long count = 0L;
    private final Map<Long, Faculty> faculties = new HashMap<>();

    public Faculty addFaculty(Faculty faculty) {
        long newId = this.count++;
        faculty.setId(newId);
        faculties.put(newId, faculty);
        return faculty;
    }

    public Faculty editFaculty(Long id, Faculty faculty) {
        if (this.faculties.containsKey(id)) {
            Faculty oldFaculty = this.faculties.get(id);
            oldFaculty.setName(faculty.getName());
            oldFaculty.setColor(faculty.getColor());
            return oldFaculty;
        } else {
            throw new FacultyNotFoundException();
        }
    }

    public Faculty findFaculty(Long id) {
        if (this.faculties.containsKey(id)) {
            return this.faculties.get(id);
        } else {
            throw new FacultyNotFoundException();
        }
    }

    public void deleteFaculty(Long id) {
        if (this.faculties.containsKey(id)) {
            this.faculties.remove(id);
        } else {
            throw new FacultyNotFoundException();
        }
    }

    public Collection<Faculty> findByColor(String color) {
        return this.faculties.values().stream()
                .filter(f -> f.getColor() == color)
                .collect(Collectors.toList());
    }
}