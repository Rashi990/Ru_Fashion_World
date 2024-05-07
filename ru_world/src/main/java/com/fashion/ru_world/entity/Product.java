package com.fashion.ru_world.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {

    @Id
    private int product_id;

    private String product_name;
    private String product_type;
    private String special_for;
    private String brand;
    private String material;
    private String colour;
    private String size;

}
