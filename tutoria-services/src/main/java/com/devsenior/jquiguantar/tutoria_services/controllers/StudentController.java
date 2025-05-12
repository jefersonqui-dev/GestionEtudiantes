package com.devsenior.jquiguantar.tutoria_services.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.devsenior.jquiguantar.tutoria_services.services.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    
    private final StudentService service;

    public StudentController(StudentService service){
        this.service = service;
    }

    @GetMapping
    public List<StudentDto> getAllStudents() {
        return service.getAll();
    }
    @GetMapping("/{id}")
    public StudentDto getMethodName(@PathVariable(name = "id") Long code){
        return service.getById(code);
    }

    @PostMapping
    public StudentDto newStudent(@RequestBody StudentDto student) {
        return service.save(student);
    }

    @DeleteMapping("/{code}")
    public StudentDto removeStudent(@PathVariable Long code){
        return service.delete(code);
    }
    
}
