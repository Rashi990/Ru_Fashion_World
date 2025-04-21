package com.fashion.ru_world.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class ProductDTO {

    private int product_id;
    private String product_name;
    private String product_type;
    private String special_for;
    private String brand;
    private String material;
    private String colour;
    private String size;
}
