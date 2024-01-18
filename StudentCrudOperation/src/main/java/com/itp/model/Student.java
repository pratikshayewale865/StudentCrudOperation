package com.itp.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_table")
public class Student implements Serializable {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 
 @Column(name = "Stud_Name")
 private String name;
 
 @Column(name = "Stud_age")
 private int age;
 
 @Column(name = "Stud_course")
 private String course;

 public Student() {
 }

 public Student(String name, int age, String course) {
     this.name = name;
     this.age = age;
     this.course = course;
 }

 public Long getId() {
     return id;
 }

 public void setId(Long id) {
     this.id = id;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public int getAge() {
     return age;
 }

 public void setAge(int age) {
     this.age = age;
 }

 public String getCourse() {
     return course;
 }

 public void setCourse(String course) {
     this.course = course;
 }

 @Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", course=" + course +  "]";
 }
 @Override
public int hashCode() {
	return Objects.hash(age, course, id, name);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	return age == other.age && Objects.equals(course, other.course) && Objects.equals(id, other.id)
			&& Objects.equals(name, other.name);
   }
 
	
}


