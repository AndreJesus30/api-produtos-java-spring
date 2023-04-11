package com.andre.cadastroproduto.products.facade;

import com.andre.cadastroproduto.products.dto.ProductDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductsFacade {
    private static final Map<Long, ProductDTO> products = new HashMap<>();

    public ProductDTO createProduct(ProductDTO productDTO) {
        Long nextId = products.keySet().size() + 1L;
        productDTO.setId(nextId);
        products.put(nextId, productDTO);
        return productDTO;
    }

    public ProductDTO updateProduct(ProductDTO productDTO, Long productId) {
        products.put(productId, productDTO);
        return productDTO;
    }

    public ProductDTO getProductById(Long productId) {
        return products.get(productId);
    }

    public List<ProductDTO> getAll() {
        return new ArrayList<>(products.values());
    }

    public String deleteProduct(Long productId) {
        products.remove(productId);
        return "Produto Deletado";
    }

    public String deleteAll() {
        products.clear();
        return "Todos os Produtos deletados";
    }

}
