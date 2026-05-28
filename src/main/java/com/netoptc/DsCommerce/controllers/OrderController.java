package com.netoptc.DsCommerce.controllers;


import com.netoptc.DsCommerce.dtos.OrderDto;
import com.netoptc.DsCommerce.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("orders")
public class OrderController {

    @Autowired
    private  OrderService orderService;

    @GetMapping("/{id}")
    public ResponseEntity<OrderDto> findById(
            @PathVariable Long id
    ) {
        OrderDto result =  orderService.findById(id);
        return ResponseEntity.ok(result);
    }
}
