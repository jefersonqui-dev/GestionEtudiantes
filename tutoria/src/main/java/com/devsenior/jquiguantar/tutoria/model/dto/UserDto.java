package com.devsenior.jquiguantar.tutoria.model.dto;

public class UserDto {
    private String name;
    private String email;
    private String password;
    private Boolean active;

    
    public UserDto(String name, String email, String password, Boolean active) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.active = active;
    }
    //getter y setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public Boolean getActive(){
        return active;
    }
    public void setActive(Boolean active){
        this.active = active;
    }
    @Override
    public String toString(){
        return "UserDto{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", active=" + active + 
                '}';
    }


}
