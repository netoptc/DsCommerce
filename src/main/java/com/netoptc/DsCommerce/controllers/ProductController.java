package com.netoptc.DsCommerce.controllers;

import com.netoptc.DsCommerce.dtos.ProductDto;
import com.netoptc.DsCommerce.dtos.ProductMinDto;
import com.netoptc.DsCommerce.services.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public ResponseEntity<Page<ProductMinDto>> findAll(
            @PageableDefault(sort = "name", direction = Sort.Direction.ASC, size = 12) Pageable pageable,
            @RequestParam(defaultValue = "") String name
    ) {
        Page<ProductMinDto> result =  productService.findAll(pageable, name);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> findById(
            @PathVariable Long id
    ) {
        ProductDto result =  productService.findById(id);
        return ResponseEntity.ok(result);
    }
}
