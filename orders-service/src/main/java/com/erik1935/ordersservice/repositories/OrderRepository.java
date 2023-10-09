package com.erik1935.ordersservice.repositories;

import com.erik1935.ordersservice.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
