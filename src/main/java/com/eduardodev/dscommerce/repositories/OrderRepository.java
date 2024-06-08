package com.eduardodev.dscommerce.repositories;

import com.eduardodev.dscommerce.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
