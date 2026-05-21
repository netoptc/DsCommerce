package com.netoptc.DsCommerce.utils;


import jakarta.persistence.Embeddable;

@Embeddable
public class OrderItemKey {
    private Long productId;
    private Long orderId;

    public OrderItemKey() {}
}

