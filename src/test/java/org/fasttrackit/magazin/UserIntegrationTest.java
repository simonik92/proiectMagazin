package org.fasttrackit.magazin;

import org.fasttrackit.magazin.domain.User;
import org.fasttrackit.magazin.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.ConfigFileApplicationContextInitializer;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MagazinApplication.class, loader = SpringApplicationContextLoader.class, initializers = ConfigFileApplicationContextInitializer.class)
public class UserIntegrationTest {


    @Autowired
    private UserService userService;



    @Test
    public void testSave() {

        User user = new User();
        user.setUsername("Simona");
        user.setNume("Caltea");
        user.setPrenume("Simona");
        userService.saveUser(user);
    }

}
