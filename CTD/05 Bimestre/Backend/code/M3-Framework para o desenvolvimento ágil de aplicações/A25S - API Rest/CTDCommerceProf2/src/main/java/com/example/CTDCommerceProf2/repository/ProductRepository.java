package com.example.CTDCommerceProf2.repository;

import com.example.CTDCommerceProf2.entity.ProductEntity;

import java.util.HashMap;
import java.util.Map;

public class ProductRepository {

    public static Map<Integer, ProductEntity> productMap = new HashMap<>();

    public static int idProduct = 1;

    public ProductEntity create(ProductEntity product){
        product.setId(idProduct++);
        productMap.put(product.getId(), product);
        return product;
    }

    public ProductEntity getById(int id){
       return productMap.get(id);
    }

}
