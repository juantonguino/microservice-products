/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codeandapps.microservice.products.controllers;

import com.codeandapps.microservice.products.domain.Product;
import com.codeandapps.microservice.products.service.IProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author diego
 */
@RestController
@RequestMapping("product")
public class ProductoController {
    
    @Autowired
    @Qualifier("productService")
    private IProductService productServide;
    
    @GetMapping(path = {"/", ""})
    public List<Product> getAll(){
        return productServide.findAll();
    }
    
    @GetMapping(path = {"/{id}"})
    public Product getById(@PathVariable Long id){
        return productServide.findById(id);
    }
}
