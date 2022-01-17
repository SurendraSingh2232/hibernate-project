package com.sunglowsys.util.test;

import com.sunglowsys.domain.Product;
import com.sunglowsys.service.ProductServiceImpl;

public class AllFindProduct {
    public static void main(String[] args) {
        Product product = new Product();
        new ProductServiceImpl().AllFind();
        System.out.println(product);
        System.out.println("founded");
    }
}
