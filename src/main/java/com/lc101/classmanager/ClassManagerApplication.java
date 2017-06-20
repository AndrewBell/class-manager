package com.lc101.classmanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ClassManagerApplication implements CommandLineRunner {

    @Autowired
    CourseDao courseDao;

    @Autowired
    StudentDao studentDao;

    public static void main(String[] args) {
        SpringApplication.run(ClassManagerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        // Delete everything in our database so we start fresh
        courseDao.deleteAll();
        studentDao.deleteAll();

        // Create Courses and save them
        System.out.println("Creating Courses");

        CourseEntity javaCourse = new CourseEntity();
        javaCourse.setName("Java");
        courseDao.save(javaCourse);

        CourseEntity pythonCourse = new CourseEntity();
        pythonCourse.setName("Python");
        courseDao.save(pythonCourse);

        // Create new students
        StudentEntity janet = new StudentEntity("Janet");
        StudentEntity julie = new StudentEntity("Julie");
        StudentEntity paul = new StudentEntity("Paul");
        StudentEntity pete = new StudentEntity("Pete");

        // Set Student Course Selections
        javaCourse.setStudents(janet);
        javaCourse.setStudents(julie);
        pythonCourse.setStudents(paul);
        pythonCourse.setStudents(pete);

        // Save Students
        studentDao.save(janet);
        studentDao.save(julie);
        studentDao.save(paul);
        studentDao.save(pete);

        // Save Courses w/ Student info
        // We need to 'update' the courses with the new relationship,
        // otherwise our students won't show associated with a course
        courseDao.save(javaCourse);
        courseDao.save(pythonCourse);
        System.out.println("Data added");

        // Display our results
        Iterable<StudentEntity> students = studentDao.findAll();
        for (StudentEntity student : students) {
            System.out.println("Found Student: " + student);
        }

    }
}
