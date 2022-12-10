package com.skypro.springbooteducational.repository;

import com.skypro.springbooteducational.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Collection<Student> getByAge(int age);
}
