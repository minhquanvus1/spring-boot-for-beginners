package com.alibou.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents() {
        return List.of(
                new Student("Alibou", "Bonou", LocalDate.now(), "contact@aliboucoding.com", 34),
                new Student("Lincoln", "Abraham", LocalDate.now(), "contact@donald_trump.com", 50)
        );
    }
}
