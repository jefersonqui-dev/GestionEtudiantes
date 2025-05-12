package com.devsenior.jquiguantar.tutoria_services.controllers;

public class StudentDto {
    private Long code;
    private String name;
    private Integer age;
    private String gender;
    private Boolean Active;

    public StudentDto() {
        
    }

    public StudentDto(Long code, String name, Integer age, String gender, Boolean active) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.gender = gender;
        Active = active;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Boolean getActive() {
        return Active;
    }

    public void setActive(Boolean active) {
        Active = active;
    }
    


    
}
