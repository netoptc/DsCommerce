package com.netoptc.DsCommerce.repositories;

import com.netoptc.DsCommerce.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository  extends JpaRepository<Order, Long> { }
