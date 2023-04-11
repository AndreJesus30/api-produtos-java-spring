import com.andre.cadastroproduto.products.dto.ProductDTO;
import com.andre.cadastroproduto.products.facade.ProductsFacade;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class ProductFacadeTest {

    public ProductDTO productDTO = new ProductDTO();
    public ProductDTO productDTO2 = new ProductDTO();
    private ProductsFacade productsFacade = new ProductsFacade();


    @Test
    public void createProductTest(){
        productDTO.setName("mesa");
        productDTO.setPrice(600.00);
        Assertions.assertEquals(productDTO, productsFacade.createProduct(productDTO));
        Assertions.assertEquals(productDTO.getName(), productsFacade.createProduct(productDTO).getName());
    }

    @Test
    public void updateProductTest(){
        productDTO.setId(Long.valueOf(1));
        productDTO.setName("mesa");
        productDTO.setPrice(720.00);
        Assertions.assertEquals(720.00, productsFacade.updateProduct(productDTO, Long.valueOf(1)).getPrice());
    }

    @Test
    public void getProductByIdTest() {
        productDTO.setName("cadeira");
        productDTO.setPrice(150.00);
        productsFacade.createProduct(productDTO);
        Assertions.assertEquals("cadeira", productsFacade.getProductById(Long.valueOf(3)).getName());
    }

    @Test
    public void getAllTest() {
        productsFacade.deleteAll();
        productDTO.setName("mesa");
        productDTO.setPrice(720.00);
        productDTO2.setName("sofá");
        productDTO2.setPrice(1500.00);
        productsFacade.createProduct(productDTO);
        productsFacade.createProduct(productDTO2);

        List listProduct = new ArrayList<ProductDTO>();
        listProduct.add(productDTO);
        listProduct.add(productDTO2);

        Assertions.assertEquals(listProduct.size(), productsFacade.getAll().size());
    }

    @Test
    public void deleteProductTest() {
        productDTO.setName("mesa");
        productDTO.setPrice(720.00);
        productDTO2.setName("sofá");
        productDTO2.setPrice(1500.00);
        productsFacade.createProduct(productDTO);
        productsFacade.createProduct(productDTO2);

        Assertions.assertEquals("Produto Deletado", productsFacade.deleteProduct(Long.valueOf(2)));
        Assertions.assertEquals(1, productsFacade.getAll().size());
    }

}
