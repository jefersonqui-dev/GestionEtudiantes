package com.devsenior.jquiguantar.tutoria_services.repositories;
import java.util.List;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import com.devsenior.jquiguantar.tutoria_services.controllers.StudentDto;

//importar LongValue


@Repository
public class SudentRepository {
    
    private List<StudentDto> students;

    public SudentRepository(){
        students = new ArrayList<>();
    }
    public List<StudentDto> findAll(){
        return students;
    }
    public StudentDto save(StudentDto student){
        students.add(student);
        return student;
    }
    public StudentDto findByCode(Long code){
        return students.stream()
            .filter(s -> s.getCode().longValue() == code)
            .findFirst()
            .get();
    }
    public StudentDto delete(Long code){
        var student = students.stream()
            .filter(s -> s.getCode().longValue() == code)
            .findFirst()
            .get();
        students.remove(student);
        return student;
    }
    
    
}
