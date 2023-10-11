package com.erik1935.ordersservice.dtos;

public record OrderItemsResponse(Long id, String sku, Double price, Long quantity) {
}
