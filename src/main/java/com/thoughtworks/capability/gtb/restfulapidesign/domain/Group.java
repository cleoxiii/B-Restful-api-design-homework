package com.thoughtworks.capability.gtb.restfulapidesign.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Group {
    private Integer id;
    private String name;
    private String note;
    private List<Student> studentList;

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void clear() {
        studentList.clear();
    }
}
