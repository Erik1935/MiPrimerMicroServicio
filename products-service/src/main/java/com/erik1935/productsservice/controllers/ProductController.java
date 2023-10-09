package com.erik1935.productsservice.controllers;

import com.erik1935.productsservice.dtos.ProductRequest;
import com.erik1935.productsservice.dtos.ProductResponse;
import com.erik1935.productsservice.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
    @PostMapping
    public ResponseEntity<?>addProducto(@RequestBody ProductRequest productRequest){
        productService.addProduct(productRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<ProductResponse>>getAllProducts(){
        return new ResponseEntity<List<ProductResponse>>(productService.getAllProducts(),HttpStatus.OK);
    }
}
