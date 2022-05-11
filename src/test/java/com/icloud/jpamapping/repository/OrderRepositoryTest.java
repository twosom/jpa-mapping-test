package com.icloud.jpamapping.repository;


import com.icloud.jpamapping.entity.Order;
import com.icloud.jpamapping.value.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Transactional
@SpringBootTest
class OrderRepositoryTest {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    EntityManager em;

    @Test
    void repositoryTest() {
        var orderNumber = new OrderNo("test_order_number");
        var memberId = new MemberId("test_member_id");
        var orderer = new Orderer(memberId, "twosom");
        var address = new Address("test_zipcode", "test_address1", "test_address2");
        var shippingInfo = new ShippingInfo(address);
        var order = new Order(orderNumber, orderer, shippingInfo);

        orderRepository.save(order);
        em.flush();
        em.clear();


        Order findOrder = orderRepository.findById(orderNumber).get();
        assertEquals(findOrder.getOrderer(), orderer);
        assertEquals(findOrder.getNumber(), orderNumber);
        assertEquals(findOrder.getShippingInfo(), shippingInfo);

    }

}