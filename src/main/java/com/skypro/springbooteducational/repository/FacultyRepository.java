package com.skypro.springbooteducational.repository;

import com.skypro.springbooteducational.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {

    Collection<Faculty> findByColor(String color);

    Collection<Faculty> findFacultyByNameIgnoreCaseOrColorIgnoreCase(String name, String color);
}
