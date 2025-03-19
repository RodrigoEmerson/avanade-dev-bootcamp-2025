package me.dio.service.impl;

import me.dio.domain.model.Product;
import me.dio.domain.repository.ProductRepository;
import me.dio.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class ProductServiceimpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceimpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public Product findById(Long id) {
        return productRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Product create(Product productToCreate) {
        if (productRepository.existsBycodigoBarras(productToCreate.getCodigoBarras())) {
            throw new IllegalArgumentException("Esse produto ja existe. ");
        }
        return productRepository.save(productToCreate);
    }
}
