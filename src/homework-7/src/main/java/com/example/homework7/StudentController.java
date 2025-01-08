package com.example.homework7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    private StudentRepository studentRepository;

    @Autowired
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/student")
    public Student getStudent(@RequestParam long id){
        return studentRepository.findById(id);
    }

    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student){
        return studentRepository.save(student);
    }

    @DeleteMapping("/student")
    public void deleteStudent(@RequestParam long id){
        studentRepository.deleteById(id);
    }




}
