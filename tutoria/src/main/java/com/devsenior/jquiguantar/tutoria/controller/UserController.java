package com.devsenior.jquiguantar.tutoria.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devsenior.jquiguantar.tutoria.model.dto.UserDto;
@RestController
public class UserController {
    private List<UserDto> users = new ArrayList<>(List.of(
        new UserDto("Juan Pérez", "juan.perez@email.com", "pass123", true),
        new UserDto("María García", "maria.garcia@email.com", "pass456", true),
        new UserDto("Carlos López", "carlos.lopez@email.com", "pass789", true),
        new UserDto("Ana Martínez", "ana.martinez@email.com", "pass321", false),
        new UserDto("Roberto Sánchez", "roberto.sanchez@email.com", "pass654", true),
        new UserDto("Laura Torres", "laura.torres@email.com", "pass987", true),
        new UserDto("Miguel Rodríguez", "miguel.rodriguez@email.com", "pass147", false),
        new UserDto("Sofía Díaz", "sofia.diaz@email.com", "pass258", true),
        new UserDto("Diego Fernández", "diego.fernandez@email.com", "pass369", true),
        new UserDto("Elena Ruiz", "elena.ruiz@email.com", "pass741", true)
    ));
    @GetMapping("/users")
    public List<UserDto> getAll(){
        return users ;
    }
    @GetMapping("/users/{pos}")
    public UserDto getById(@PathVariable int pos){
        return users.get(pos);
    }
    @PostMapping("/users")
    public UserDto create(@RequestBody UserDto user){
        users.add(user);
        return user;
    }
    @DeleteMapping("/users/{pos}")
    public UserDto delete(@PathVariable int pos){
        return users.remove(pos);
    }
    @PutMapping("/users/{pos}")
    public UserDto update(@PathVariable int pos, @RequestBody UserDto user){
        users.set(pos, user);
        return user;
    }
}
