package com.example.CtdCommerceProf.entity.dto;

import com.example.CtdCommerceProf.entity.CategoryEntity;

public class CategoryDTO {
    private int id;
    private String name;

    public CategoryDTO(CategoryEntity categoryEntity) {
        this.id = categoryEntity.getId();
        this.name = categoryEntity.getName();
    }

    public CategoryDTO() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
