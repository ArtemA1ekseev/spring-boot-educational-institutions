package com.skypro.springbooteducational.repository;

import com.skypro.springbooteducational.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;

public interface  StudentRepository extends JpaRepository<Student, Long> {

    Collection<Student> findByAge(int age);
    Collection<Student> findByAgeBetween(int minAge, int maxAge);

    @Query(value = "SELECT COUNT(*) FROM student", nativeQuery = true)
    int getAllStudentsSql(); //long getAllStudentsSql();

    @Query(value = "SELECT AVG(age) FROM student", nativeQuery = true)
    float getAvgAgeStudents(); //double getAvgAgeStudents();

    @Query(value = "SELECT * FROM student ORDER BY id DESC LIMIT 5", nativeQuery = true)
    List<Student> getLast5Students();
}
