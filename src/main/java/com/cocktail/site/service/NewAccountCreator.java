package com.cocktail.site.service;


import com.cocktail.site.Entities.User;
import com.cocktail.site.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class NewAccountCreator {


    UsersRepository usersRepository;
    PasswordEncoder passwordEncoder;

    @Autowired
    public NewAccountCreator(UsersRepository usersRepository, PasswordEncoder passwordEncoder) {
        this.usersRepository = usersRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void save (User user) {

        User newUser = new User(
                user.getName(),
                user.getEmail().toLowerCase(),
                passwordEncoder.encode(user.getPassword()),
                user.getCity());

        usersRepository.save(newUser);

    }


}
