package com.sunglowsys.service;

import com.sunglowsys.domain.Product;

import java.util.List;

public interface ProductService {

    Product save(Product product);

    Product update(Product product,Long id);

    List<Product> AllFind();

    Product findById(Long id);

    Product deleteById(Long id);

}
