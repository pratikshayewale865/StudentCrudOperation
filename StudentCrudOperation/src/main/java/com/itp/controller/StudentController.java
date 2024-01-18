package com.itp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itp.model.Student;
import com.itp.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {

 @Autowired
 private StudentService studentService;

 @GetMapping
 public List<Student> getAllStudents() {
     return studentService.getAllStudents();
 }

 @GetMapping("/{id}")
 public Optional<Student> getStudentById(@PathVariable Long id) {
     return studentService.getStudentById(id);
 }

 @PostMapping
 public Student createStudent(@RequestBody Student student) {
     return studentService.createStudent(student);
 }

 @PutMapping("/{id}")
 public Student updateStudent(@PathVariable Long id, @RequestBody Student updatedStudent) {
     return studentService.updateStudent(id, updatedStudent);
 }

 @DeleteMapping("/{id}")
 public void deleteStudent(@PathVariable Long id) {
     studentService.deleteStudent(id);
 }
}

