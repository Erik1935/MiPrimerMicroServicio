package com.erik1935.productsservice.services;

import com.erik1935.productsservice.dtos.ProductRequest;
import com.erik1935.productsservice.dtos.ProductResponse;
import com.erik1935.productsservice.entities.Product;
import com.erik1935.productsservice.mappers.ProductMapper;
import com.erik1935.productsservice.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public void addProduct(ProductRequest productRequest){
        var producto = Product.builder()
                .sku(productRequest.getSku())
                .name(productRequest.getName())
                .price(productRequest.getPrice())
                .description(productRequest.getDescription())
                .status(productRequest.getStatus()).build();
        productRepository.save(producto);
    }
    public List<ProductResponse> getAllProducts(){
        return productMapper.getProducts(productRepository.findAll());
    }
}
