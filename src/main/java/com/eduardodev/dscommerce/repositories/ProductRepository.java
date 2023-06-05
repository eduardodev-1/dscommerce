package com.eduardodev.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardodev.dscommerce.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
