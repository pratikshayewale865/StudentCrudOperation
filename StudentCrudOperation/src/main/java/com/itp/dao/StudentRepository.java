package com.itp.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.itp.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
 
}

