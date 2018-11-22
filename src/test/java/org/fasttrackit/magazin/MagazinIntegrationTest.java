package org.fasttrackit.magazin;

import org.fasttrackit.magazin.domain.Magazin;
import org.fasttrackit.magazin.service.MagazinService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.ConfigFileApplicationContextInitializer;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MagazinApplication.class, loader = SpringApplicationContextLoader.class, initializers = ConfigFileApplicationContextInitializer.class)
public class MagazinIntegrationTest {


    @Autowired
    private MagazinService magazinService;



    @Test
    public void testSave() {

        Magazin magazin = new Magazin();
        magazin.setNume("Sefora");
        magazin.setAdresa("str. Ion Agarbiceanu, nr.20");
        magazin.setTelefon("0264-123456");
        magazinService.saveMagazin(magazin);
    }

}