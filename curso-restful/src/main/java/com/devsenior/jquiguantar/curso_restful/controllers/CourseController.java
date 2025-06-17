package com.devsenior.jquiguantar.curso_restful.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.devsenior.jquiguantar.curso_restful.services.CourseService;
import com.devsenior.jquiguantar.curso_restful.models.dto.CourseResponse;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import lombok.RequiredArgsConstructor;
import com.devsenior.jquiguantar.curso_restful.models.dto.CourseRequest;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
@RequiredArgsConstructor
@RestController
@RequestMapping("api/cursos")
public class CourseController {
    private final CourseService courseService;

    @GetMapping
    public List<CourseResponse> getAllCourses(){
        return courseService.getAll();
    }

    @GetMapping("/{id}")
    public CourseResponse getById(@PathVariable Long id){
        return courseService.getOne(id);
    }

    @GetMapping("/name/{name}")
    public List<CourseResponse> getCoursesByName(@RequestParam("nombre") String name){
        return courseService.getByName(name);
    }

    @PostMapping
    public CourseResponse createCourse(@RequestBody CourseRequest course){
        return courseService.create(course);
    }

    @PutMapping("/{id}")
    public CourseResponse updateCourse(@PathVariable Long id, @RequestBody CourseRequest course){
        return courseService.update(id, course);
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable Long id){
        courseService.delete(id);
    }
    

    
    
}
