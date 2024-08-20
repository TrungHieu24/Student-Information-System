package com.example.t2209m_nguyentrunghieu.service;
import com.example.t2209m_nguyentrunghieu.entities.Student;
import com.example.t2209m_nguyentrunghieu.repository.StudentRepository;
import com.example.t2209m_nguyentrunghieu.repository.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAllWithScoresAndSubjects();
    }

    @Override
    public Student findStudentById(Integer id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }
}

