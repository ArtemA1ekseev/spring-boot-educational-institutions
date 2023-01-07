package com.skypro.springbooteducational.service;

import java.util.*;

import com.skypro.springbooteducational.model.Faculty;
import com.skypro.springbooteducational.repository.FacultyRepository;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class FacultyService {

    private final FacultyRepository facultyRepository;

    private final static Logger logger = LoggerFactory.getLogger(FacultyService.class);

    public FacultyService(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    public Faculty addFaculty(Faculty faculty) {
        logger.debug("addFaculty method is in progress");
        return this.facultyRepository.save(faculty);
    }

    public Faculty editFaculty(Long id, Faculty faculty) {
        logger.debug("editFaculty method is in progress");
        return this.facultyRepository.save(faculty);
    }

    public Faculty findFaculty(Long id) {
        logger.debug("findFaculty method is in progress");
        return this.facultyRepository.findById(id).get();
    }

    public void deleteFaculty(Long id) {
        logger.debug("deleteFaculty method is in progress");
        this.facultyRepository.deleteById(id);
    }

    public Collection<Faculty> getAllFaculties() {
        logger.debug("getAllFaculties method is in progress");
        return this.facultyRepository.findAll();
    }

    public Collection<Faculty> findByColor(String color) {
        logger.debug("findByColor method is in progress");
        return this.facultyRepository.findByColor(color);
    }

    public Collection<Faculty> findFacultyByNameIgnoreCaseOrColorIgnoreCase(String name, String color) {
        logger.debug("findFacultyByNameIgnoreCaseOrColorIgnoreCase method is in progress");
        return this.facultyRepository.findFacultyByNameIgnoreCaseOrColorIgnoreCase(name, color);
    }
}