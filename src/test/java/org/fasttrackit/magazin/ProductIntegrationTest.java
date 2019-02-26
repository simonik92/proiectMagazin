package org.fasttrackit.magazin;

import org.fasttrackit.magazin.domain.Product;
import org.fasttrackit.magazin.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.ConfigFileApplicationContextInitializer;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MagazinApplication.class, loader = SpringApplicationContextLoader.class, initializers = ConfigFileApplicationContextInitializer.class)

public class ProductIntegrationTest {
    @Autowired
    private ProductService productService;

    @Test
    public void testSave()
    {
        Product product = new Product();
        product.setName("Face & body");
        product.setPret("150 lei");
        productService.saveProduct(product);
    }
}
