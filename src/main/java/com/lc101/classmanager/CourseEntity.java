/**
 * Created by Andrew Bell 6/19/17
 * www.recursivechaos.com
 * andrew@recursivechaos.com
 * Licensed under MIT License 2017. See license.txt for details.
 */

package com.lc101.classmanager;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class CourseEntity {

    @Id
    @GeneratedValue
    Integer id;

    String name;

    @ManyToMany
    List<StudentEntity> students = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

    public List<StudentEntity> getStudents() {
        return students;
    }

    public void setStudents(List<StudentEntity> students) {
        this.students = students;
    }

    public void addStudent(StudentEntity studentEntity){
        this.students.add(studentEntity);
    }

    public void setStudents(StudentEntity students) {
        this.students.add(students);
    }

    public String toString() {
        String printStudent = "";
        for(StudentEntity student : students){
            printStudent = printStudent + student.getName() + " ";
        }

        return "ID: " + this.id + " Course Name: " + this.name + " Students: " + printStudent;
    }

}
