package me.dio.service;

import me.dio.domain.model.Product;

public interface ProductService {

    Product findById(Long id);

    Product create(Product productToCreate);

}
