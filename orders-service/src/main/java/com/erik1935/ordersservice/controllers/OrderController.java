package com.erik1935.ordersservice.controllers;

import com.erik1935.ordersservice.dtos.OrderRequest;
import com.erik1935.ordersservice.dtos.OrderResponse;
import com.erik1935.ordersservice.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/order")
public class OrderController {
    private final OrderService orderService;

    @PostMapping
    public ResponseEntity<?>placeOrder(@RequestBody OrderRequest orderRequest){
        orderService.placeOrder(orderRequest);
        return new ResponseEntity<>("Orden creada",HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<OrderResponse>>findAllOrders(){
        return new ResponseEntity<List<OrderResponse>>(orderService.getAllOrders(),HttpStatus.OK);
    }

}
