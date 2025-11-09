package com.dev.robertpertuz.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.robertpertuz.product.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

}

