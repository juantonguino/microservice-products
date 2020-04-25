/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codeandapps.microservice.products.service;

import com.codeandapps.microservice.products.domain.Product;
import com.codeandapps.microservice.products.repository.IProductDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author diego
 */
@Service("productService")
public class ProductService implements IProductService{

    @Autowired
    @Qualifier("productoRepository")
    private IProductDao productoRepository;
    
    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return (List<Product>) productoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Product findById(Long id) {
        //return productoRepository.findById(id).orElse(null);
        return productoRepository.findById(id).get();
    }
    
}
