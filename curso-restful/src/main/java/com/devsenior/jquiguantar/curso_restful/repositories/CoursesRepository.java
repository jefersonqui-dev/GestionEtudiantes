package com.devsenior.jquiguantar.curso_restful.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devsenior.jquiguantar.curso_restful.models.entities.Course;

public interface CoursesRepository extends JpaRepository<Course, Long>{
    
}
