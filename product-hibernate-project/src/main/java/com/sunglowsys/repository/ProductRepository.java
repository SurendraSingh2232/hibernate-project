package com.sunglowsys.repository;

import com.sunglowsys.domain.Product;

import java.util.List;

public interface ProductRepository {

    Product save(Product product);

    Product update(Product product,Long id);

    List<Product> AllFind();

    Product findById(Long id);

    Product deleteById(Long id);

}
