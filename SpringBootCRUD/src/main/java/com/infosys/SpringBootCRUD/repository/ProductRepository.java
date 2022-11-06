package com.infosys.SpringBootCRUD.repository;

import com.infosys.SpringBootCRUD.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}
