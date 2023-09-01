package com.alibou.springdemo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    private StudentService service; // field injection
    //@Autowired
    // constructor injection
    public StudentController(StudentService service) {
        this.service = service;
    }
    @PostMapping

    public  Student save( @RequestBody Student s) {
        return this.service.save(s);
    }

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable("email") String em) {
        return this.service.findByEmail(em);
    }

    @PutMapping
    public Student update( @RequestBody Student s) {
        return this.service.update(s);
    }

    @DeleteMapping("/{email}")
    public void delete( @PathVariable("email") String email) {
        this.service.delete(email);
    }
    @GetMapping
    public List<Student> findAllStudents() {
        return this.service.findAllStudents();

    }
}
