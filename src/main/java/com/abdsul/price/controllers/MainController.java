package com.abdsul.price.controllers;

import com.abdsul.price.model.Category;
import com.abdsul.price.model.SubCategory;
import com.abdsul.price.model.Work;
import com.abdsul.price.services.CategoryService;
import com.abdsul.price.services.SubCategoryService;
import com.abdsul.price.services.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin()
@RestController
@RequestMapping("/price-list")
public class MainController {
    @Autowired
    private WorkService workService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private SubCategoryService subCategoryService;

    @GetMapping("/works")
    public ResponseEntity<List<Work>> getWorks(){
        List<Work> works = workService.findAll();
        return new ResponseEntity<>(works, HttpStatus.OK);
    }

    @PostMapping("/works")
    public ResponseEntity<Work> addWork(@RequestBody Work work){
        Work addedWork = workService.add(work);
        return new ResponseEntity<>(addedWork, HttpStatus.OK);
    }

    @DeleteMapping("/works/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id){
        Work work = workService.findWorkById(id);
        boolean deleted = workService.delete(work);
        return new ResponseEntity<>(deleted, HttpStatus.OK);
    }

    @GetMapping("/categories")
    public ResponseEntity<List<Category>> getCategories(){
        List<Category> categories = categoryService.findAll();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @GetMapping("/subCategories")
    public ResponseEntity<List<SubCategory>> getSubCategories(){
        List<SubCategory> subCategories = subCategoryService.findAll();
        return new ResponseEntity<>(subCategories, HttpStatus.OK);
    }
}
