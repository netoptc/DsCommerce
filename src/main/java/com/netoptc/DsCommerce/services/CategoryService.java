package com.netoptc.DsCommerce.services;


import com.netoptc.DsCommerce.entities.Category;
import com.netoptc.DsCommerce.exceptions.ResourceNotFoundException;
import com.netoptc.DsCommerce.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    Category findById(Long id) {
        return categoryRepository.findById(id).orElseThrow(ResourceNotFoundException::new);
    }

}

