/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.upeu.Spring.service;

import java.util.List;
import pe.edu.upeu.Spring.entity.Product;

/**
 *
 * @author etham
 */
public interface ProductService {
    
    public List<Product> findAll();
    public Product findById(Long id);
    public Product save (Product producto);
    public void delete(Product producto);
    public void deleteById(Long id);
    
}
