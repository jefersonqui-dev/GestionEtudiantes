package com.devsenior.jquiguantar.tutoria.model.dto;

public class ProductDto {
    private String name;
    private String description;
    private Double price;
    private String image;
    private String category;
    private String brand;
    private String color;
    private String size;

    public ProductDto(String name, String description, Double price, String image, String category, String brand, String color, String size) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
        this.category = category;
        this.brand = brand;
        this.color = color;
        this.size = size;
    }
    //getter y setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public Double getPrice(){
        return price;
    }
    public void setPrice(Double price){
        this.price = price;
    }
    public String getImage(){
        return image;
    }
    public void setImage(String image){
        this.image = image;
    }
    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getSize(){
        return size;
    }
    public void setSize(String size){
        this.size = size;
    }
    @Override
    public String toString(){
        return "ProductDto [name=" + name + ", description=" + description + ", price=" + price + ", image=" + image + ", category=" + category + ", brand=" + brand + ", color=" + color + ", size=" + size + "]";
    }
}
