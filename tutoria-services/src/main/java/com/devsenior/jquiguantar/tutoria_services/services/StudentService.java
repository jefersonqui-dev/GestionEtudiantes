package com.devsenior.jquiguantar.tutoria_services.services;

import org.springframework.stereotype.Service;
import java.util.List;
import com.devsenior.jquiguantar.tutoria_services.controllers.StudentDto;
import com.devsenior.jquiguantar.tutoria_services.repositories.SudentRepository;

@Service
public class StudentService {

    private final SudentRepository repository;

    public StudentService(SudentRepository repository){
        this.repository = repository;
    }

    public List<StudentDto> getAll() {
        return repository.findAll();
    }

    public StudentDto getById(Long code){
        if(code < 1){
            throw new RuntimeException("El codigo enviado no es valido");
        }
        return repository.findByCode(code);
    }

    public StudentDto save(StudentDto student) {
        if(student.getCode() == null){
            throw new RuntimeException("El campo Codigo es obligatorio: ");
        }else if (student.getName() == null || student.getName().isBlank())
        {
            throw new RuntimeException("El campo Nombre es obligatorio:");
        }else if (student.getGender() == null || student.getGender().isBlank())
        {
            throw new RuntimeException("El campo Genero es obligatorio:");
        }
        if(student.getActive() == null){
            student.setActive(true);
        }
        return repository.save(student);
    }
    public StudentDto delete(Long code) {
        if(code < 1){
            throw new RuntimeException("El codigo enviado no es valido");
        }
        return repository.delete(code);
    }
}
