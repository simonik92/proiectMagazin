package org.fasttrackit.magazin.service;

import org.fasttrackit.magazin.domain.User;
import org.fasttrackit.magazin.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user) {
        if (user.getUsername()==null) {
            throw new IllegalArgumentException("Username can not be null");
        }

            if (user.getNume()==null) {
                throw new IllegalArgumentException("Numele nu poate fi null");
            }

            try {
                userRepository.save(user);
            }catch(Exception e) {
                System.out.println("Error when saving user " + e);
            }

    }

}
