package com.netoptc.DsCommerce.services;


import com.netoptc.DsCommerce.dtos.ProductDto;
import com.netoptc.DsCommerce.dtos.ProductMinDto;
import com.netoptc.DsCommerce.entities.Product;
import com.netoptc.DsCommerce.exceptions.ResourceNotFoundException;
import com.netoptc.DsCommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public Page<ProductMinDto> findAll(Pageable pageable, String name) {
        Page<Product> result = productRepository.findAllByName(pageable, name);
        return  result.map(ProductMinDto::new);
    }

    public ProductDto findById(Long id) {
        Product result = productRepository.findById(id).orElseThrow(ResourceNotFoundException::new);
        return  new ProductDto(result);
    }

}
