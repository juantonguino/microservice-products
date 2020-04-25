/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codeandapps.microservice.products.repository;

import com.codeandapps.microservice.products.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author diego
 */
@Repository("productoRepository")
public interface IProductDao extends CrudRepository<Product, Long>{
    
}
