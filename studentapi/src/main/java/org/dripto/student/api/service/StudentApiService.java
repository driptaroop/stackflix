package org.dripto.student.api.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;

import org.dripto.student.model.Students;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class StudentApiService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getDetailsAlt")
    public Students getDetails(){
        ResponseEntity<Students> response = restTemplate.getForEntity("http://localhost:8080/api/getStudentDetails", Students.class);
        log.info("response code: " + response.getStatusCodeValue());
        return response.getBody();
    }

    public Students getDetailsAlt(){
        ResponseEntity<Students> response = restTemplate.getForEntity("http://localhost:8080/api/getStudentDetailsFromCache", Students.class);
        log.info("response code: " + response.getStatusCodeValue());
        return response.getBody();
    }

}
