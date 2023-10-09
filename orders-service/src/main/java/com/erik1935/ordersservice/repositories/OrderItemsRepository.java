package com.erik1935.ordersservice.repositories;

import com.erik1935.ordersservice.entities.OrderItems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemsRepository extends JpaRepository<OrderItems,Long> {
}
