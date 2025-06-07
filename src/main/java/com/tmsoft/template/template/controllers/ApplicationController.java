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

    @GetMapping("/sales/order-listings")
    public String salesOrderLisings() {
        return "/sales/page-order-listings";
    }

    @GetMapping("/sales/add-order")
    public String salesAddOrder() {
        return "/sales/page-add-order";
    }

    @GetMapping("/sales/edit-order")
    public String salesEditOrder() {
        return "/sales/page-edit-order";
    }

    @GetMapping("/sales/order-details")
    public String salesOrderDetails() {
        return "/sales/page-order-details";
    }

    @GetMapping("/customer/listings")
    public String customerListings() {
        return "/customers/page-customer-listings";
    }

    @GetMapping("/customer/details")
    public String customerDetails() {
        return "/customers/page-customer-details";
    }

    @GetMapping("/reports/product-view")
    public String reportProductView() {
        return "/reports/page-product-view";
    }

    @GetMapping("/reports/sales")
    public String reportSales() {
        return "/reports/page-sales";
    }

    @GetMapping("/reports/returns")
    public String reportReturns() {
        return "/reports/page-returns";
    }

    @GetMapping("/reports/customer-orders")
    public String reportCustomerOrders() {
        return "/reports/page-customer-orders";
    }

    @GetMapping("/reports/shipping")
    public String reportShipping() {
        return "/reports/page-shipping";
    }

    @GetMapping("/ecom-settings")
    public String ecomSettings() {
        return "/page-ecom-settings";
    }

    @GetMapping("/users/list")
    public String usersList() {
        return "/userManagement/page-user-lists";
    }

    @GetMapping("/users/detail")
    public String usersDetails() {
        return "/userManagement/page-user-details";
    }

    @GetMapping("/login")
    public String login() {
        return "/page-login";
    }

    @GetMapping("/deactivation")
    public String deactivation() {
        return "/page-deactivation";
    }

    @GetMapping("/error-404")
    public String error() {
        return "/error-404";
    }
}
