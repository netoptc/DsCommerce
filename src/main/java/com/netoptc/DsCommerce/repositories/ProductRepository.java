package com.netoptc.DsCommerce.repositories;

import com.netoptc.DsCommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> { }
