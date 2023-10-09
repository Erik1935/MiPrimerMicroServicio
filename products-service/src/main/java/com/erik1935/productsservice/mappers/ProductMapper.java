package com.erik1935.productsservice.mappers;

import com.erik1935.productsservice.dtos.ProductRequest;
import com.erik1935.productsservice.dtos.ProductResponse;
import com.erik1935.productsservice.entities.Product;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    public ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    @Mappings({
            @Mapping(source = "sku",target = "sku"),
            @Mapping(source = "name",target = "name"),
            @Mapping(source = "description",target = "description"),
            @Mapping(source = "price",target = "price"),
            @Mapping(source = "status",target = "status")
    })
    List<ProductResponse> getProducts(List<Product> product);
}
