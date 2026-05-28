package com.netoptc.DsCommerce.dtos;

import com.netoptc.DsCommerce.entities.Order;
import com.netoptc.DsCommerce.entities.OrderItem;
import com.netoptc.DsCommerce.enums.OrderStatus;
import jakarta.validation.constraints.NotEmpty;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class OrderDto {
    private Long id;
    private Instant moment;
    private OrderStatus status;
    private ClientDto client;
    private PaymentDto paymentDto;

    @NotEmpty(message = "Deve ter pelo menos um item")
    private List<OrderItemDto> items = new ArrayList<>();

    public OrderDto(Long id, Instant moment, OrderStatus status, ClientDto client, PaymentDto paymentDto) {
        this.id = id;
        this.moment = moment;
        this.status = status;
        this.client = client;
        this.paymentDto = paymentDto;
    }

    public OrderDto(Order entity) {
        this.id = entity.getId();
        this.moment = entity.getMoment();
        this.status =  entity.getStatus();
        this.client = new ClientDto(entity.getClient());
        this.paymentDto = new PaymentDto(entity.getPayment());
        for (OrderItem orderItem : entity.getOrderItems()) {
            items.add(new OrderItemDto(orderItem));
        }
    }

    public Long getId() {
        return id;
    }

    public Instant getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public ClientDto getClient() {
        return client;
    }

    public PaymentDto getPaymentDto() {
        return paymentDto;
    }

    public List<OrderItemDto> getItems() {
        return items;
    }

    public Double getTotal() {
        Double total = 0.0;
        for (OrderItemDto item : this.items) {
            total += item.getSubTotal();
        }
        return total;
    }
}
