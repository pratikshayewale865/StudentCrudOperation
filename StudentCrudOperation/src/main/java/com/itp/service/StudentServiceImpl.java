package com.itp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itp.dao.StudentRepository;
import com.itp.model.Student;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

 @Autowired
 private StudentRepository studentRepository;

 @Override
 public List<Student> getAllStudents() {
     return studentRepository.findAll();
 }

 @Override
 public Optional<Student> getStudentById(Long id) {
     return studentRepository.findById(id);
 }

 @Override
 public Student createStudent(Student student) {
     return studentRepository.save(student);
 }

 @Override
 public Student updateStudent(Long id, Student updatedStudent) {
     Student existingStudent = studentRepository.findById(id).orElse(null);
     if (existingStudent != null) {
         existingStudent.setName(updatedStudent.getName());
         existingStudent.setAge(updatedStudent.getAge());
         existingStudent.setCourse(updatedStudent.getCourse());

         return studentRepository.save(existingStudent);
     }
     return null;
 }

 @Override
 public void deleteStudent(Long id) {
     studentRepository.deleteById(id);
 }
}

