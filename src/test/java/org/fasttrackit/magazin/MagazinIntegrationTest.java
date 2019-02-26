package org.fasttrackit.magazin;

import org.fasttrackit.magazin.domain.Product;
import org.fasttrackit.magazin.domain.Magazin;
import org.fasttrackit.magazin.dto.MagazinDTO;
import org.fasttrackit.magazin.dto.ProductDTO;
import org.fasttrackit.magazin.service.MagazinService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.ConfigFileApplicationContextInitializer;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MagazinApplication.class, loader = SpringApplicationContextLoader.class, initializers = ConfigFileApplicationContextInitializer.class)
public class MagazinIntegrationTest {


    @Autowired
    private MagazinService magazinService;



    @Test
    public void testSave() {

        MagazinDTO magazin = new MagazinDTO();
        magazin.setNume("Sefora");
        magazin.setAdresa("str. Ion Agarbiceanu, nr.20");
        magazin.setTelefon("0264-123456");

        ProductDTO product1 = new ProductDTO();
        product1.setName("Mascara");
        product1.setPret("59.99");
        ProductDTO product2 = new ProductDTO();
        product1.setName("Fard de pleoape");
        product1.setPret("300");
        ProductDTO product3 = new ProductDTO();
        product1.setName("Fond de ten");
        product1.setPret("250");
        ProductDTO product4 = new ProductDTO();
        product1.setName("Baza de machiaj");
        product1.setPret("70");
        ProductDTO product5 = new ProductDTO();
        product1.setName("Eyeliner");
        product1.setPret("90");
        ProductDTO product6 = new ProductDTO();
        product2.setName("Pudra compacta");
        product2.setPret("70");
        ProductDTO product7 = new ProductDTO();
        product2.setName("Blush");
        product2.setPret("150");
        ProductDTO product8 = new ProductDTO();
        product2.setName("Anticearcane");
        product2.setPret("120");
        ProductDTO product9 = new ProductDTO();
        product2.setName("Iluminator");
        product2.setPret("200");
        ProductDTO product10 = new ProductDTO();
        product2.setName("Ruj");
        product2.setPret("120");


        magazin.getProducts().add(product1);
        magazin.getProducts().add(product2);
        magazin.getProducts().add(product3);
        magazin.getProducts().add(product4);
        magazin.getProducts().add(product5);
        magazin.getProducts().add(product6);
        magazin.getProducts().add(product7);
        magazin.getProducts().add(product8);
        magazin.getProducts().add(product9);
        magazin.getProducts().add(product10);

        magazinService.saveMagazin(magazin);

        List<org.fasttrackit.magazin.dto.MagazinDTO> shops = magazinService.getMagazin();
        System.out.println("---------------------"+shops.get(0));


    }

}