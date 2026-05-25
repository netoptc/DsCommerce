package com.netoptc.DsCommerce.dtos;

import com.netoptc.DsCommerce.entities.Product;
import jakarta.validation.constraints.Positive;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ProductDto {

    private Long id;
    private String name;
    private String description;

    @Positive(message = "Campo preço deve ser maior que zero")
    private Double price;
    private String imgUrl;
    private Set<CategoryDto> categories = new HashSet<>();


    public ProductDto() { };
    public ProductDto(Long id, String name, String description, Double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imgUrl = imgUrl;
        this.price = price;
    }


    public ProductDto(Product entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.description = entity.getDescription();
        this.price = entity.getPrice();
        this.imgUrl = entity.getImgUrl();
        this.categories = entity.getCategories().stream().map(CategoryDto::new).collect(Collectors.toSet());
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() { return description; }

    public String getImgUrl() {
        return imgUrl;
    }

    public Double getPrice() {
        return price;
    }

    public Set<CategoryDto> getCategories() {
        return categories;
    }
}
