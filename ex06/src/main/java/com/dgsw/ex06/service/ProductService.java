package com.dgsw.ex06.service;

import com.dgsw.ex06.entity.Product;
import com.dgsw.ex06.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public Product update(Long id, Product product) throws Exception {
        Optional<Product> optional = productRepository.findById(id);
        if (optional.isPresent()) {
            Product temp = optional.get();
            temp.setName(product.getName());
            temp.setPrice(product.getPrice());
            temp.setDescription(product.getDescription());
            return productRepository.save(temp);
        } else {
            throw new Exception("해당하는 id: " + id + "이(가) 없어서 수정할 내용이 없습니다.");
        }
    }

    public boolean deleteProduct(Long id) throws Exception {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new Exception("해당하는 id: " + id + "이(가) 없어서 삭제할 내용이 없습니다."));
        productRepository.delete(product);
        return true;
    }
}
