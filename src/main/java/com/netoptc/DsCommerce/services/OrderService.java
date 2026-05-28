package com.netoptc.DsCommerce.services;


import com.netoptc.DsCommerce.dtos.OrderDto;
import com.netoptc.DsCommerce.entities.Order;
import com.netoptc.DsCommerce.exceptions.ResourceNotFoundException;
import com.netoptc.DsCommerce.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Transactional(readOnly = true)
    public OrderDto findById(Long id) {
        Order order =  orderRepository.findById(id).orElseThrow(ResourceNotFoundException::new);
        return new OrderDto(order);
    }
}
