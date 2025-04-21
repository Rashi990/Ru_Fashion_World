package com.fashion.ru_world.repository;

import com.fashion.ru_world.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

public interface ProductRepo extends JpaRepository<Product,Integer> {

    //Select by Id
    //Using Native Query
    @Query(value = "SELECT * FROM product WHERE product_id = ?1",nativeQuery = true )
    Product getProductByProductID(String productID);
}
