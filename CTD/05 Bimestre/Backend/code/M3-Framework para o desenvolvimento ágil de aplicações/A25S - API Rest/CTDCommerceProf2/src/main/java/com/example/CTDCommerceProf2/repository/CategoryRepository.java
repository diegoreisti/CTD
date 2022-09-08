package com.example.CTDCommerceProf2.repository;

import com.example.CTDCommerceProf2.entity.CategoryEntity;

import java.util.HashMap;
import java.util.Map;

public class CategoryRepository {
    private static Map<Integer, CategoryEntity> categoryMap = new HashMap<>();

    private static int idCategory = 1;

    public CategoryEntity create(CategoryEntity category){
        category.setId(idCategory++);
        categoryMap.put(category.getId(), category);
        return category;
    }

    public CategoryEntity getById(int id){
        return categoryMap.get(id);
    }

}
