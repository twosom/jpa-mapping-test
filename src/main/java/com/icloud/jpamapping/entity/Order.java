package com.icloud.jpamapping.entity;

import com.icloud.jpamapping.value.OrderNo;
import com.icloud.jpamapping.value.Orderer;
import com.icloud.jpamapping.value.ShippingInfo;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "purchase_order")
public class Order {

    @EmbeddedId
    private OrderNo number;

    @Embedded
    private Orderer orderer;

    @Embedded
    private ShippingInfo shippingInfo;

    public Order(OrderNo number, Orderer orderer, ShippingInfo shippingInfo) {
        this.number = number;
        this.orderer = orderer;
        this.shippingInfo = shippingInfo;
    }

    protected Order() {
    }

    public OrderNo getNumber() {
        return number;
    }

    public Orderer getOrderer() {
        return orderer;
    }

    public ShippingInfo getShippingInfo() {
        return shippingInfo;
    }
}
