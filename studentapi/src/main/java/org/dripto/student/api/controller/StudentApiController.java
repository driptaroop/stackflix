package org.dripto.student.api.controller;


import org.dripto.student.api.service.StudentApiService;
import org.dripto.student.model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentApiController {

    @Autowired
    private StudentApiService service;

    @RequestMapping(value = "/getDetails", method = RequestMethod.GET)
    public Students getDetails(){
        return service.getDetails();
    }
}
