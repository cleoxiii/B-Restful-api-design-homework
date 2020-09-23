package com.thoughtworks.capability.gtb.restfulapidesign.repository;

import com.thoughtworks.capability.gtb.restfulapidesign.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class StudentRepository {
    List<Student> studentList = new ArrayList<>();

    public Student addStudent(Student student) {
        studentList.add(student);
        return student;
    }

    public int count() {
        return studentList.size();
    }

    public void deleteStudent(int id) {
        studentList.remove(id - 1);
    }

    public List<Student> getAllStudents() {
        return studentList;
    }

    public List<Student> getStudentsByGender(String gender) {
        return studentList.stream().filter(student -> student.getGender().equals(gender)).collect(Collectors.toList());
    }

    public Student getStudentById(int id) {
        return studentList.get(id - 1);
    }

    public Student updateStudentInfos(int id, Student student) {
        studentList.set(id - 1, student);
        return getStudentById(id);
    }
}
