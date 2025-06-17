package com.devsenior.jquiguantar.curso_restful.services.impl;
import com.devsenior.jquiguantar.curso_restful.services.CourseService;
import org.springframework.stereotype.Service;
import java.util.List;
import com.devsenior.jquiguantar.curso_restful.models.dto.CourseResponse;
import com.devsenior.jquiguantar.curso_restful.models.dto.CourseRequest;
import com.devsenior.jquiguantar.curso_restful.repositories.CoursesRepository;
import lombok.RequiredArgsConstructor;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import com.devsenior.jquiguantar.curso_restful.models.entities.Course;
import com.devsenior.jquiguantar.curso_restful.exceptions.CourseNotFoundExceptions;
import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService{

    private final CoursesRepository courseRepository;
    private DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
    
    @Override
    public List<CourseResponse> getAll(){

        // List<CourseResponse> responses = new ArrayList<>();
        // var courses = courseRepository.findAll();

        // for (var course : courses) {
        //     responses.add(toResponse(course));
        // }
        // return responses;
        return courseRepository.findAll().stream()
        .map(this::toResponse)
        .toList();
    }

    @Override
    public CourseResponse getOne(Long id){
        return courseRepository.findById(id)
        .map(this::toResponse)
        .orElseThrow(() -> new CourseNotFoundExceptions("Curso no encontrado"));
        
    }

    @Override
    public List<CourseResponse> getByName(String name){
        return null;
    }
    
    @Override
    public CourseResponse create(CourseRequest course){
        var entity = toEntity(course);

        var newCourse = courseRepository.save(entity);
        
        return toResponse(newCourse);
    }

    @Override
    public CourseResponse update(Long id, CourseRequest course){
        var entityOptional = courseRepository.findById(id);
        if(!entityOptional.isPresent()){
            throw new CourseNotFoundExceptions("Curso no encontrado");
        }
        var entity = toEntity(course);
        entity.setId(entityOptional.get().getId());
        var updateEntity = courseRepository.save(entity);

        return toResponse(updateEntity);
    }

    @Override
    public void delete(Long id){
        courseRepository.deleteById(id);
    }

    private CourseResponse toResponse(Course course){
        var response = new CourseResponse();
        response.setCourseId(course.getId());
        response.setName(course.getName());
        response.setCode(course.getCode());
        response.setDescription(course.getDescription());
        response.setInitlDate(course.getInitialDate().format(formatter));
        response.setEndDate(course.getFinalDate().format(formatter));
        response.setCreditsNum(course.getCredits());
        return response;
    }
    private Course toEntity(CourseRequest course){
        var entity = new Course();
        entity.setName(course.getName());
        entity.setCode(course.getCode());
        entity.setDescription(course.getDescription());
        entity.setInitialDate(LocalDate.parse(course.getInitlDate(),formatter));
        entity.setFinalDate(LocalDate.parse(course.getEndDate(),formatter));
        entity.setCredits(course.getCreditsNum());
        return entity;
    }
}
