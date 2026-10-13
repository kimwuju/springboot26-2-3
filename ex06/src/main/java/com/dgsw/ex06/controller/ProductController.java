package com.dgsw.ex06.controller;

import com.dgsw.ex06.entity.Product;
import com.dgsw.ex06.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
@CrossOrigin
public class ProductController {
    private final ProductService productService;

    @GetMapping()
    public List<Product> findAll() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable Long id) {
        return productService.findById(id);
    }

    @PostMapping()
    public Product save(@RequestBody Product product) {
        return productService.save(product);
    }

    @PutMapping("/{id}")
    public Product update(@PathVariable Long id, @RequestBody Product product) throws Exception {
        return productService.update(id, product);
    }

    @DeleteMapping("/{id}")
    public boolean deleteById(@PathVariable Long id) throws Exception {
        return productService.deleteProduct(id);
    }

}
