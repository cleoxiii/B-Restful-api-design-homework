package com.thoughtworks.capability.gtb.restfulapidesign.repository;

import com.thoughtworks.capability.gtb.restfulapidesign.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository {
    Map<Integer, Student> studentMap = new HashMap<>();

    public Student addStudent(Student student) {
        studentMap.put(student.getId(), student);
        return student;
    }

    public int count() {
        return studentMap.size();
    }
}
