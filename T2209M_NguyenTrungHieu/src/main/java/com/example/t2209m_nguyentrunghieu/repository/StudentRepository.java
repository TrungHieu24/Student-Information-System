package com.example.t2209m_nguyentrunghieu.repository;


import com.example.t2209m_nguyentrunghieu.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
