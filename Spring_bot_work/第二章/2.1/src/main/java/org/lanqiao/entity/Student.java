package org.lanqiao.entity;

import java.util.Arrays;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "student")
public class Student {
    private String school;
    private int id;
    private String name;
    private Integer age;
    private int[] courseid;

    public String getschool() {
        return school;
    }

    public void setschool(String school) {
        this.school = school;
    }
    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getage() {
        return age;
    }

    public void setage(int age) {
        this.age = age;
    }

    public String getcourseid() {
        return name;
    }

    public void setcourseid(int[] courseid) {
        this.courseid = courseid;
    }

    @Override
    public String toString() {
        return "Student {id=" + id +
                ", name=" + name +
                ", age=" + age +
                ", courseid=" + Arrays.toString(courseid) + "}";
    }
}