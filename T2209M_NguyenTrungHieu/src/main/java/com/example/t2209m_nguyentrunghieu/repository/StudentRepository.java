package com.example.t2209m_nguyentrunghieu.repository;


import com.example.t2209m_nguyentrunghieu.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    @Query("SELECT s FROM Student s LEFT JOIN FETCH s.scores WHERE s.studentId = :id")
    Student findByIdWithScores(@Param("id") Integer id);

    @Query("SELECT s FROM Student s LEFT JOIN FETCH s.scores sc LEFT JOIN FETCH sc.subject")
    List<Student> findAllWithScoresAndSubjects();
}

