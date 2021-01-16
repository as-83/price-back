package com.abdsul.price.services;


import com.abdsul.price.repos.SubCategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubCategoryServiceImpl implements SubCategoryService {
    @Autowired
    SubCategoryRepo subCategoryRepo;


    
}
