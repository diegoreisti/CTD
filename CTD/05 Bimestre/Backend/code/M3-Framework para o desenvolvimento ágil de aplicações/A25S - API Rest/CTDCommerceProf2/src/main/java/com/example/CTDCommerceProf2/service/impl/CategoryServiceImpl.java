package com.example.CTDCommerceProf2.service.impl;

import com.example.CTDCommerceProf2.entity.CategoryEntity;
import com.example.CTDCommerceProf2.entity.dto.CategoryDTO;
import com.example.CTDCommerceProf2.repository.CategoryRepository;
import com.example.CTDCommerceProf2.service.ICommerceService;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryServiceImpl implements ICommerceService<CategoryDTO> {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public CategoryDTO create(CategoryDTO categoryDTO) {
        CategoryEntity category = new CategoryEntity(categoryDTO);
        categoryRepository.create(category);
        return null;
    }

    @Override
    public CategoryDTO getById(int id) {
        return new CategoryDTO(categoryRepository.getById(id));
    }
}
