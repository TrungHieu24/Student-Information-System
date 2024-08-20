package com.example.t2209m_nguyentrunghieu.repository;

import com.example.t2209m_nguyentrunghieu.entities.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAllStudents();
    Student findStudentById(Integer id);
    void saveStudent(Student student);
    void deleteStudent(Integer id);
}
