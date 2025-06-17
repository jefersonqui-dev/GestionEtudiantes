package com.devsenior.jquiguantar.curso_restful.models.dto;

import lombok.Data;

@Data
public class CourseRequest {

    private String name;
    private String code;
    private String description;
    private String initlDate;
    private String endDate;
    private Integer creditsNum;
}
