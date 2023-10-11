package com.erik1935.inventoryservice.controllers;

import com.erik1935.inventoryservice.dtos.BaseResponse;
import com.erik1935.inventoryservice.dtos.OrderItemRequest;
import com.erik1935.inventoryservice.services.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/inventory")
public class InventoryController {
    private final InventoryService inventoryService;
    @GetMapping("/{sku}")
    public ResponseEntity<Boolean>isInStock(@PathVariable String sku){
        inventoryService.isInStock(sku);
    return new ResponseEntity<>(HttpStatus.OK);
    }
    @PostMapping("/in-stock")
    public ResponseEntity<BaseResponse> areInStock(@RequestBody List<OrderItemRequest> orderItems) {
        return new ResponseEntity<BaseResponse>(inventoryService.areInStock(orderItems),HttpStatus.OK);
    }
}