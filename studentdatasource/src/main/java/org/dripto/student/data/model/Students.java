package org.dripto.student.data.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Students {
    private String message;
    private List<Student> students;
}
