package com.skypro.springbooteducational;

import com.skypro.springbooteducational.model.Faculty;
import com.skypro.springbooteducational.service.FacultyService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FacultyControllerTest {
    /*
    private FacultyService facultyService = new FacultyService();

    @BeforeEach
    void setUp() {
        Faculty faculty1 = new Faculty(0L, "TestName1", "TestColor1");
        facultyService.addFaculty(faculty1);
        Faculty faculty2 = new Faculty(0L, "TestName2", "TestColor2");
        facultyService.addFaculty(faculty2);
        Faculty faculty3 = new Faculty(0L, "TestName3", "TestColor3");
        facultyService.addFaculty(faculty3);
    }

    @Test
    void createFaculty() {
        Faculty faculty = new Faculty(0L, "TestName4", "TestColor4");
        facultyService.addFaculty(faculty);
        assertEquals(faculty, facultyService.findFaculty(faculty.getId()));
        assertEquals(facultyService.getAllFaculties().size(),4);
    }

    @Test
    void deleteFaculty() {
        assertEquals(facultyService.getAllFaculties().size(), 3);
        facultyService.deleteFaculty(1L);
        assertEquals(facultyService.getAllFaculties().size(), 2);
    }

    @Test
    void updateSFaculty() {
        Faculty faculty = new Faculty(0L, "TestName5", "TestColor5");
        facultyService.editFaculty(1L,faculty);
        assertEquals(faculty.getName(),"TestName5");
        assertEquals(faculty.getColor(),"TestColor5");
    }

    @Test
    void searchFaculty() {
        Faculty faculty = facultyService.findFaculty(2L);
        assertEquals(faculty.getName(),"TestName3");
        assertEquals(faculty.getColor(),"TestColor3");
    }

    @Test
    void getAllFaculty() {
        Collection<Faculty> collection = facultyService.getAllFaculties();
        assertEquals(collection.size(),3);
    }

    @Test
    void test() {
        Collection<Faculty> collection = facultyService.findByColor("TestColor2");
        assertEquals(collection.size(), 1);
    }
    */
}
