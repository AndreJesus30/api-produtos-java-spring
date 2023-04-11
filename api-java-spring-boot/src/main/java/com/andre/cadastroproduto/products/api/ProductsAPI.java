package com.andre.cadastroproduto.products.api;

import com.andre.cadastroproduto.products.dto.ProductDTO;
import com.andre.cadastroproduto.products.facade.ProductsFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductsAPI {
    @Autowired
    private ProductsFacade productsFacade;


    @GetMapping
    @ResponseBody
    public String getPage(){
        return "Esta é a página inicial \nPara ver os produtos vá para /produtos \n";
    }

    @PostMapping("/produtos")
    @ResponseBody
    public ProductDTO create(@RequestBody ProductDTO productDTO) {
        return productsFacade.createProduct(productDTO);
    }

    @PutMapping("/produtos/{productId}")
    @ResponseBody
    public ProductDTO update(@PathVariable("productId") Long productId, @RequestBody ProductDTO productDTO) {
        return productsFacade.updateProduct(productDTO, productId);
    }

    @GetMapping("/produtos")
    @ResponseBody
    public List<ProductDTO> getAll() {
        return productsFacade.getAll();
    }

    @GetMapping("/produtos/{productId}")
    @ResponseBody
    public ProductDTO getById(@PathVariable("productId") Long productId) {
        return productsFacade.getProductById(productId);
    }

    @DeleteMapping("/produtos/{productId}")
    @ResponseBody
    public String delete(@PathVariable("productId") Long productId){
        return productsFacade.deleteProduct(productId);
    }


}
