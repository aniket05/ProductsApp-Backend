package com.ani.Productdemo.Repository;

import com.ani.Productdemo.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

    Optional<Product> findByName(String product_name);
}
