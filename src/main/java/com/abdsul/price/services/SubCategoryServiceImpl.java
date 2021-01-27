package com.abdsul.price.services;


import com.abdsul.price.model.SubCategory;
import com.abdsul.price.repos.SubCategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubCategoryServiceImpl implements SubCategoryService {
    @Autowired
    SubCategoryRepo subCategoryRepo;


    @Override
    public List<SubCategory> findAll() {
        return subCategoryRepo.findAll();
    }
}
