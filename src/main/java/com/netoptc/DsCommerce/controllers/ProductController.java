package com.netoptc.DsCommerce.controllers;

import com.netoptc.DsCommerce.dtos.ProductMinDto;
import com.netoptc.DsCommerce.services.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public ResponseEntity<Page<ProductMinDto>> findAll(Pageable pageable) {
        Page<ProductMinDto> result =  productService.findAll(pageable);
        return ResponseEntity.ok(result);
    }

}
