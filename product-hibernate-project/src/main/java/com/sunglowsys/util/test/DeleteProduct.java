package com.sunglowsys.util.test;

import com.sunglowsys.domain.Product;
import com.sunglowsys.service.ProductServiceImpl;

public class DeleteProduct {
    public static void main(String[] args) {
        Product product = new Product();
        new ProductServiceImpl().deleteById(3L);
        System.out.println(product);
        System.out.println("deleted................ ");
    }
}
