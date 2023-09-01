package com.alibou.springdemo.student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMeomoryStudentService implements StudentService{
    private final InMemoryStudentDao dao;

    public InMeomoryStudentService(InMemoryStudentDao dao) {
        this.dao = dao;
    }

    @Override
    public Student save(Student s) {
        return this.dao.save(s);
    }

    @Override
    public List<Student> findAllStudents() {
    return this.dao.findAllStudents();
//        return List.of(
//                new Student("Alibou", "Bonou", LocalDate.now(), "contact@aliboucoding.com", 34),
//                new Student("Lincoln", "Abraham", LocalDate.now(), "contact@donald_trump.com", 50)
//        );
    }

    @Override
    public Student findByEmail(String email) {
        return this.dao.findByEmail(email);
    }

    @Override
    public Student update(Student s) {
        return this.dao.update(s);
    }

    @Override
    public void delete(String email) {
        this.dao.delete(email);
    }
}
