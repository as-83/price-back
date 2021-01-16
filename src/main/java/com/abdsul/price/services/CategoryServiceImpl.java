package com.abdsul.price.services;


import com.abdsul.price.model.Category;
import com.abdsul.price.repos.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepo categoryRepo;


    @Override
    public List<Category> findAll() {
        return categoryRepo.findAll();
    }
}
