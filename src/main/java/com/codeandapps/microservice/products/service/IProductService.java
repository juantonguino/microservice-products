/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codeandapps.microservice.products.service;

import com.codeandapps.microservice.products.domain.Product;
import java.util.List;

/**
 *
 * @author diego
 */
public interface IProductService {
    
    public List<Product> findAll();
    
    public Product findById(Long id);
}
