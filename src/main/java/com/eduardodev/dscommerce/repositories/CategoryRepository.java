package com.eduardodev.dscommerce.repositories;

import com.eduardodev.dscommerce.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
