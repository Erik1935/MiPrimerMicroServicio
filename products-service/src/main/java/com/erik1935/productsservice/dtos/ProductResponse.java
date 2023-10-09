package com.erik1935.productsservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductResponse {
    private String sku;
    private String name;
    private String description;
    private Double price;
    private Boolean status;
}
