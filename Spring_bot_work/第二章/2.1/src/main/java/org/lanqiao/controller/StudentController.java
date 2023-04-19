package org.lanqiao.controller;

import org.lanqiao.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController {
    @Autowired
    private Student student;
    @Value("${student.school}")
    private String school;

    @RequestMapping("/student")
    public String getStudent() {
        return "school="+school+"<br />"+student.toString();
    }
}