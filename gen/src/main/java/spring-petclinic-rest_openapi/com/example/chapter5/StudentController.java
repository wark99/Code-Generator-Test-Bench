package com.example.chapter5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents() throws IOException {
        return studentService学生们();
    }

    @GetMapping("/students/{id}")
    public Student findById(final int id) throws IOException {
        return studentService.findById(id);
    }

    @PostMapping("/students", Map.Entry<String, Integer, String>())
    public Student createStudent(final String name, Integer age,
                                String university) {
        return studentService.create(name, age, university);
    }

    @PutMap("/students/{id}", Map.Entry<String, Integer, String>())
    public void updateStudent(final int id, final String new_name,
                             final Integer new_age, final String new_university) {
        return studentService.update(id, name = new_name, age = new_age,
                                      university = new_university);
    }

    @DeleteMap("/students/{id}", Map.Entry<String, Integer>())
    public void deleteStudent(final int id) {
        return studentService.delete(id);
    }
}

