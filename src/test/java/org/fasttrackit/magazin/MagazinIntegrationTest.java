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
        magazin.setNume("Sefora2");
        magazin.setAdresa("str. Ion Agarbiceanu, nr.20");
        magazin.setTelefon("0264-123456");

        ProductDTO product1 = new ProductDTO();
        product1.setName("Mascara");
        product1.setPret("12");
        ProductDTO product2 = new ProductDTO();
        product2.setName("Fard de pleoape");
        product2.setPret("40");


        ProductDTO product3 = new ProductDTO();
        product3.setName("Fond de ten");
        product3.setPret("55");

        ProductDTO product4 = new ProductDTO();
        product4.setName("Baza de machiaj");
        product4.setPret("50");

        magazin.getProducts().add(product1);
        magazin.getProducts().add(product2);
        magazin.getProducts().add(product3);
        magazin.getProducts().add(product4);

        magazinService.saveMagazin(magazin);

        List<MagazinDTO> shops = magazinService.getMagazin();
        System.out.println("---------------------"+shops.get(0));


    }

}