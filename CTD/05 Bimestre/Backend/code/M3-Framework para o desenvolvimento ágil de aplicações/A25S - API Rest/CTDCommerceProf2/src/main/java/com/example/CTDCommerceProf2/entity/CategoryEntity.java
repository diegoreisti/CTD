package com.example.CTDCommerceProf2.entity;

import com.example.CTDCommerceProf2.entity.dto.CategoryDTO;

public class CategoryEntity {
    private int id;
    protected String name;

    public CategoryEntity(CategoryDTO categoryDTO) {
        this.name = categoryDTO.getNome();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
