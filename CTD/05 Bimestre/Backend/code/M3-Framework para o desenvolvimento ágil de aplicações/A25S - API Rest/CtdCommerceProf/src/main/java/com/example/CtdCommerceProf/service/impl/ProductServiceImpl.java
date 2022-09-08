package com.example.CtdCommerceProf.service.impl;

import com.example.CtdCommerceProf.entity.CategoryEntity;
import com.example.CtdCommerceProf.entity.ProductEntity;
import com.example.CtdCommerceProf.entity.dto.CategoryDTO;
import com.example.CtdCommerceProf.entity.dto.ProductDTO;
import com.example.CtdCommerceProf.repository.IProductRepository;
import com.example.CtdCommerceProf.service.ICommerceService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ICommerceService<ProductDTO> {
    @Autowired
    private IProductRepository productRepository;

    @Autowired
    private com.example.CtdCommerceProf.service.impl.CategoryServiceImpl categoryService;

    @Override
    public ProductDTO create(ProductDTO productDTO) {
        /*int categoryId = categoryService.getByName(categoryName);
        productEntity.setCategory(categoryId);*/
        //productEntity.setCategoryId(categoryService.getByName(productDTO.getCategory()));

        ProductEntity productEntity = mapperDTOToEntity(productDTO);
        CategoryDTO categoryDTO;
        int idCategory = productEntity.getCategory().getId();

        if (categoryService.ifCategoryExists(idCategory)) {
            categoryDTO = categoryService.getById(idCategory);
            CategoryEntity category = new CategoryEntity(categoryDTO);
            productEntity.setCategory(category);
            productEntity = productRepository.save(productEntity);
        }

        productDTO = mapperEntityToDTO(productEntity);
        return productDTO;
    }

    @Override
    public ProductDTO getById(int id) {
        ProductEntity productEntity = productRepository.findById(id).get();
        ProductDTO productDTO = mapperEntityToDTO(productEntity);
       //productDTO.setCategory(categoryService.getById(productEntity.getCategoryId()).getName());
        return productDTO;
    }

    /*private String getNameCategory(ProductEntity productEntity) {
        int categoryId = productEntity.getCategory();
        CategoryDTO categoryDTO = categoryService.getById(categoryId);
        String categoryName = categoryDTO.getName();
        return categoryName;
    }*/

    @Override
    public List<ProductDTO> getAll() {
        /*List<ProductEntity> productEntities = productRepository.getAll();
        List<ProductDTO> productDTOs = new ArrayList<>();

        for (ProductEntity product : productEntities) {
            String categoryName = getNameCategory(product);
            ProductDTO productDTO = mapperEntityToDTO(product);
            productDTO.setCategory(categoryName);
            productDTOs.add(productDTO);
        }

        return productDTOs;*/
        return null;
    }

    @Override
    public String delete(int id) {

        return "";
    }

    @Override
    public ProductDTO update(ProductDTO productDTO, int id) {
        /*ProductEntity productEntity = mapperDTOToEntity(productDTO);
        String categoryName = productDTO.getCategory();
        *//*int categoryId = categoryService.getByName(categoryName);
        productEntity.setCategory(categoryId);*//*
        productEntity.setId(id);

        if (productEntity.getCategory() != 0)
            productRepository.create(productEntity);

        return productDTO;*/
        return null;
    }

    private ProductEntity mapperDTOToEntity(ProductDTO productDTO) {
        ObjectMapper objectMapper = new ObjectMapper();
        ProductEntity product = objectMapper.convertValue(productDTO, ProductEntity.class);
        return product;
    }

    private ProductDTO mapperEntityToDTO(ProductEntity productEntity) {
        ObjectMapper objectMapper = new ObjectMapper();
        ProductDTO product = objectMapper.convertValue(productEntity, ProductDTO.class);
        return product;
    }
}
