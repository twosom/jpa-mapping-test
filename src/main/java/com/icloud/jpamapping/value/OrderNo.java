package com.icloud.jpamapping.value;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class OrderNo implements Serializable {
    @Column(name = "order_no")
    private String orderNo;

    public OrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    protected OrderNo() {
    }

    public String getOrderNo() {
        return orderNo;
    }
}
