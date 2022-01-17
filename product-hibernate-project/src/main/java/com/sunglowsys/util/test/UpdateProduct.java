package com.sunglowsys.util.test;

import com.sunglowsys.domain.Product;
import com.sunglowsys.repository.ProductRepositoryImpl;
import com.sunglowsys.service.ProductService;

public class UpdateProduct {
    public static void main(String[] args) {
        Product product = new Product();
        product.setProductBrand("phone");
        new ProductRepositoryImpl().update(product,1L);
    }
}
