package com.example.CTDCommerceProf2.entity.dto;

import com.example.CTDCommerceProf2.entity.CategoryEntity;

public class CategoryDTO {
    private String name;

    public CategoryDTO(CategoryEntity category) {
        this.name = category.getName();
    }

    public String getNome() {
        return name;
    }

    public void setNome(String name) {
        this.name = name;
    }
}
