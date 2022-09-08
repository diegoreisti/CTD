package com.example.CtdCommerceProf.service.impl;

import com.example.CtdCommerceProf.entity.CategoryEntity;
import com.example.CtdCommerceProf.entity.dto.CategoryDTO;
import com.example.CtdCommerceProf.repository.ICategoryRepository;
import com.example.CtdCommerceProf.service.ICommerceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICommerceService<CategoryDTO> {
    @Autowired
    private ICategoryRepository categoryRepository;

    @Override
    public CategoryDTO create(CategoryDTO categoryDTO) {
        CategoryEntity categoryEntity = new CategoryEntity(categoryDTO);
        categoryEntity = categoryRepository.save(categoryEntity);
        categoryDTO = new CategoryDTO(categoryEntity);
        return categoryDTO;
    }

    @Override
    public CategoryDTO getById(int id) {
        CategoryEntity category = categoryRepository.findById(id).get();
        return new CategoryDTO(category);
    }

    @Override
    public List<CategoryDTO> getAll() {
        return null;
    }

    @Override
    public String delete(int id) {
        return null;
    }

    @Override
    public CategoryDTO update(CategoryDTO categoryDTO, int id) {
        return null;
    }

    public boolean ifCategoryExists(int id) {
        return categoryRepository.existsById(id);
    }

    /*public int getByName(String name) {
        return categoryRepository.getByName(name);
    }*/
}
