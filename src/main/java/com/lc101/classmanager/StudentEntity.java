/**
 * Created by Andrew Bell 6/19/17
 * www.recursivechaos.com
 * andrew@recursivechaos.com
 * Licensed under MIT License 2017. See license.txt for details.
 */

package com.lc101.classmanager;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class StudentEntity {

    @Id
    @GeneratedValue
    Integer id;

    String name;

    @ManyToOne
    CourseEntity course;

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

    public String toString() {
        return "ID: " + this.id + " Name: " + this.name + " course: " + course;
    }

}












