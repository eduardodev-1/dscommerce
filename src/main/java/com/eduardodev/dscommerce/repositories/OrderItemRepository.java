package com.eduardodev.dscommerce.repositories;

import com.eduardodev.dscommerce.entities.OrderItem;
import com.eduardodev.dscommerce.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
