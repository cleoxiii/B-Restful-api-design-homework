package com.thoughtworks.capability.gtb.restfulapidesign.service;

import com.thoughtworks.capability.gtb.restfulapidesign.domain.Student;
import com.thoughtworks.capability.gtb.restfulapidesign.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student addStudent(Student student) {
        student.setId(studentRepository.count() + 1);
        return studentRepository.addStudent(student);
    }

    public void deleteStudent(int id) {
        studentRepository.deleteStudent(id);
    }

    public List<Student> getStudents(String gender) {
        if (gender != null) {
            return studentRepository.getStudentsByGender(gender);
        } else {
            return studentRepository.getAllStudents();
        }
    }
}
