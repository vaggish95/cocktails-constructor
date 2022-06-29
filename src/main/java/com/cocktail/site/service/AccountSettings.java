package com.cocktail.site.service;


import com.cocktail.site.Entities.User;
import com.cocktail.site.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.security.Principal;

@Service
public class AccountSettings {

    UsersRepository usersRepository;
    PasswordEncoder passwordEncoder;

    @Autowired
    public AccountSettings(UsersRepository usersRepository, PasswordEncoder passwordEncoder) {
        this.usersRepository = usersRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public String resetPassword (Principal principal, String oldPassword,  String newPassword, String newPassportRepeat){
        String message = "Пароль успешно изменен";
        User userUpdate = usersRepository.findByName(principal.getName());

        if (passwordEncoder.matches(oldPassword, userUpdate.getPassword())) {

            if (newPassword.equals(newPassportRepeat)) {
                userUpdate.setPassword(passwordEncoder.encode(newPassword));
                usersRepository.save(userUpdate);
            } else
                message= "Пароли не совпадают";

        } else
            message= "Старый пароль введен неврно";

        return message;
    }

    public void removeUser (Principal principal){
        usersRepository.delete(usersRepository.findByName(principal.getName()));
    }



}
