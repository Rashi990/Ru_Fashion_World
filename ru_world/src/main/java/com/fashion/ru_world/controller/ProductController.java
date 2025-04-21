package com.fashion.ru_world.controller;

import com.fashion.ru_world.dto.ProductDTO;
import com.fashion.ru_world.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/product")
@CrossOrigin

public class ProductController {

    @Autowired
    private ProductService productService;

    //Get all products
    @GetMapping("/getProducts")
    public List<ProductDTO>getProducts(){
        return productService.getAllProducts();
    }

    //Save new product
    @PostMapping("/saveProduct")
    public ProductDTO saveProduct(@RequestBody ProductDTO productDTO){
        return productService.saveProduct(productDTO);
    }



}
