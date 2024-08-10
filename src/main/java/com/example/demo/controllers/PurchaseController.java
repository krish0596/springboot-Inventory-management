package com.example.demo.controllers;

import com.example.demo.domain.Product;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller public class PurchaseController {
    @Autowired
    private ApplicationContext context;

    @GetMapping("/purchaseproduct")
    public String purchaseProduct(@RequestParam("productID") int theId, Model theModel) {
        ProductService productService = context.getBean(ProductServiceImpl.class);
        Product product=productService.findById(theId);

        if (product.getInv() >= 1) {
            try {
                product.setInv(product.getInv() - 1);
                productService.save(product);
                return "confirmationpurchaseproduct";
            }
            catch (Exception e) {
                return "failedpurchaseproduct";
            }
        }

        return "failedpurchaseproduct";
    }
}
