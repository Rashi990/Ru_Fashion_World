package com.fashion.ru_world.service;

import com.fashion.ru_world.dto.ProductDTO;
import com.fashion.ru_world.entity.Product;
import com.fashion.ru_world.repository.ProductRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional

public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private ModelMapper modelMapper;

    //Get all products
    public List<ProductDTO> getAllProducts(){
        List<Product>productList=productRepo.findAll();
        return modelMapper.map(productList, new TypeToken<List<ProductDTO>>(){}.getType());
    }

    //Save new product
    public ProductDTO saveProduct(ProductDTO productDTO){
        productRepo.save(modelMapper.map(productDTO, Product.class));
        return productDTO;
    }
}
