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
public class StudentEntity {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    @ManyToMany(mappedBy = "students")
    private List<CourseEntity> courses = new ArrayList<>();

    public StudentEntity() {
    }

    public StudentEntity(String name) {
        this.name = name;
    }

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

    public void addCourse(CourseEntity courseEntity){
        this.courses.add(courseEntity);
    }

    public List<CourseEntity> getCourses(){
        return this.courses;
    }

    public String toString() {
        return "ID: " + this.id + " Name: " + this.name;
    }

}












