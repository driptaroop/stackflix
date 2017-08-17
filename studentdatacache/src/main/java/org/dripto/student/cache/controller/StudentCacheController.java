package org.dripto.student.cache.controller;

import org.dripto.student.model.Students;
import org.springframework.web.bind.annotation.RequestMapping;

public interface StudentCacheController {
    @RequestMapping("/getStudentDetailsFromCache")
    Students getStudentsDetails();
}
