/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.Spring.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.Spring.entity.Product;
import pe.edu.upeu.Spring.repository.ProductRepository;
import pe.edu.upeu.Spring.service.ProductService;

/**
 *
 * @author User
 */

@Service
public class ProductServiceImpl implements ProductService{
    
    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product save(Product producto) {
        return productRepository.save(producto);
    }

    @Override
    public void delete(Product producto) {
        productRepository.delete(producto);
    }

    @Override
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }
    
    
    
}
