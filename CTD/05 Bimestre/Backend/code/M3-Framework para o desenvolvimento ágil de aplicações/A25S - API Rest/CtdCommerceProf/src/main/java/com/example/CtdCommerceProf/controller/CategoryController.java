package com.example.CtdCommerceProf.controller;

import com.example.CtdCommerceProf.entity.dto.CategoryDTO;
import com.example.CtdCommerceProf.service.impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryServiceImpl categoryService;

    @PostMapping
    public CategoryDTO create(@RequestBody CategoryDTO categoryDTO){
        return categoryService.create(categoryDTO);
    }

    @GetMapping("{id}")
    public CategoryDTO getById(@PathVariable int id){
        return categoryService.getById(id);
    }

    @GetMapping("/getByName")
    public CategoryDTO getByName(@RequestParam(value = "name") String name){
        return categoryService.getByName(name);
    }
}
