/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.Spring.PController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upeu.Spring.entity.Product;
import pe.edu.upeu.Spring.service.ProductService;

/**
 *
 * @author etham
 */

@RestController
@RequestMapping("/producto")
@Api(value = "Microservicio de Gestion de los productos", description = "Microservicio de Gestion de los productos")
public class ProductController {
    
    @Autowired
    ProductService productoService;
    
    @ApiOperation(value = "Lista de productos")
    @GetMapping("/all")
    public List<Product> findAll(){
        return productoService.findAll();
    }
    
    @ApiOperation(value = "Obtiene datos de un producto")
    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        Product product = productoService.findById(id);
        return ResponseEntity.ok(product);
    }
    
    @ApiOperation(value = "Crea una producto")
    @PostMapping("/save")
    public Product save(@RequestBody Product product){
        return productoService.save(product);
    }
    
    @ApiOperation(value = "Modifica un producto")
    @PutMapping("/update")
    public Product update(@RequestBody Product product){
        return productoService.save(product);
    }
    
    @ApiOperation(value = "Elimina un producto")
    @DeleteMapping("/id")
    public void deleteById(@PathVariable Long id){
        productoService.deleteById(id);
    }
    
}
