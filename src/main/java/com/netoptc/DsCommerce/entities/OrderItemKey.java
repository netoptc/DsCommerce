package com.netoptc.DsCommerce.entities;


import jakarta.persistence.Embeddable;

@Embeddable
public class OrderItemKey {
    private Long productId;
    private Long orderId;

    public OrderItemKey() {}
}

