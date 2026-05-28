package com.netoptc.DsCommerce.repositories;

import com.netoptc.DsCommerce.entities.OrderItem;
import com.netoptc.DsCommerce.entities.OrderItemKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemKey> { }