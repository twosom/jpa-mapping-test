package com.icloud.jpamapping.repository;

import com.icloud.jpamapping.entity.Order;
import com.icloud.jpamapping.value.OrderNo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, OrderNo> {

}
