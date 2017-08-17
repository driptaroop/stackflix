package org.dripto.student.data.controller;


import org.dripto.student.model.Students;
import org.springframework.web.bind.annotation.RequestMapping;

public interface StudentDataController {
    @RequestMapping("/getStudentDetails")
    Students getStudentsDetails();
}
