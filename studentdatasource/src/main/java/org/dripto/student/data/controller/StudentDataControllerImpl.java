package org.dripto.student.data.controller;


import org.dripto.student.model.Student;
import org.dripto.student.model.Students;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class StudentDataControllerImpl implements StudentDataController {

    @Override
    @RequestMapping(value = "/getStudentDetails", method = RequestMethod.GET)
    public Students getStudentsDetails(){
        return Students.builder().message("Student details from datasource")
                .students(Arrays.asList(
                        Student.builder().age(12).name("harry").build(),
                        Student.builder().age(11).name("ron").build()
                )).build();
    }

}
