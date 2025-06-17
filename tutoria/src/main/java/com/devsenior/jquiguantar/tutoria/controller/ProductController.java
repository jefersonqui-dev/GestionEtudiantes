package com.devsenior.jquiguantar.tutoria.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.devsenior.jquiguantar.tutoria.model.dto.ProductDto;

@RestController
public class ProductController {
    private List<ProductDto> products = new ArrayList<>(List.of(
        new ProductDto("Camiseta", "Camiseta de algodón", 19.99, "https://via.placeholder.com/150", "Ropa", "Nike", "Blanco", "M"),
        new ProductDto("Pantalón", "Pantalón de algodón", 29.99, "https://via.placeholder.com/150", "Ropa", "Adidas", "Negro", "L"),
        new ProductDto("Zapatos", "Zapatos de cuero", 39.99, "https://via.placeholder.com/150", "Calzado", "Puma", "Rojo", "42"),
        new ProductDto("Zapatos", "Zapatos de cuero", 39.99, "https://via.placeholder.com/150", "Calzado", "Puma", "Rojo", "42")
    ));
    @GetMapping("/products")
    public List<ProductDto> getAll(){
        return products;
    }
    @GetMapping("/products/{pos}")
    public ProductDto getById(@PathVariable int pos){
        return products.get(pos);
    }
    @PostMapping("/products")
    public ProductDto create(@RequestBody ProductDto product){
        products.add(product);
        return product;
    }
    @DeleteMapping("/products/{pos}")
    public ProductDto delete(@PathVariable int pos){
        return products.remove(pos);
    }
    @PutMapping("/products/{pos}")
    public ProductDto update(@PathVariable int pos, @RequestBody ProductDto product){
        products.set(pos, product);
        return product;
    }
}
