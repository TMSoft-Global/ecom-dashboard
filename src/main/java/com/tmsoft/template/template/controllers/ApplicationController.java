package com.tmsoft.template.template.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class ApplicationController {
    
    @GetMapping("/")
    public String getMethodName() {
        return "index";
    }
    
    @GetMapping("/catalog/products")
    public String catalogProduct() {
        return "/catalog/page-products";
    }
    
    @GetMapping("/catalog/add-product")
    public String catalogAddProduct() {
        return "/catalog/page-add-product";
    }

    @GetMapping("/catalog/edit-product")
    public String catalogEditProduct() {
        return "/catalog/page-edit-product";
    }

    @GetMapping("/catalog/categories")
    public String catalogCategory() {
        return "/catalog/page-categories";
    }

    @GetMapping("/catalog/add-category")
    public String catalogAddCategory() {
        return "/catalog/page-add-category";
    }

    @GetMapping("/catalog/edit-category")
    public String catalogEditCategory() {
        return "/catalog/page-edit-category";
    }
}
