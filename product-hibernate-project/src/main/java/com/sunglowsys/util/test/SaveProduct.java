package com.sunglowsys.util.test;

import com.sunglowsys.domain.Product;
import com.sunglowsys.service.ProductService;
import com.sunglowsys.service.ProductServiceImpl;

public class SaveProduct {
    public static void main(String[] args) {
        Product product = new Product(1L,"leptop","iphone11","silver","apple");
        ProductService productService = new ProductServiceImpl();

        Product product1 = productService.save(product);
        System.out.println(product1);
        System.out.println("saved");

    }
}
