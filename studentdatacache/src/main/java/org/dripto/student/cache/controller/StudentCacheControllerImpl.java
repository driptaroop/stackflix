package org.dripto.student.cache.controller;

import org.dripto.student.cache.model.Students;
import org.dripto.student.cache.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class StudentCacheControllerImpl implements StudentCacheController {

    @Override
    @RequestMapping("/getStudentDetailsFromCache")
    public Students getStudentsDetails(){
        return Students.builder().message("Student details from Cache")
                .students(Arrays.asList(
                        Student.builder().age(12).name("harry").build(),
                        Student.builder().age(11).name("ron").build()
                )).build();
    }

}
