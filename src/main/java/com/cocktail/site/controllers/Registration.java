package com.cocktail.site.controllers;


import com.cocktail.site.Entities.User;
import com.cocktail.site.repository.UsersRepository;
import com.cocktail.site.service.NewAccountCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/registration")
public class Registration {

    NewAccountCreator newAccountCreator;

    @Autowired
    public Registration(NewAccountCreator newAccountCreator) {
        this.newAccountCreator = newAccountCreator;
    }

    @GetMapping
    public String login (){
        return "registration";
    }

    @PostMapping
    public String signIn (User user, Model model){

        if  (user.getPassword().equals(user.getPassword_repeat())) {
            newAccountCreator.save(user);
            return "login";
        }
        else {
            model.addAttribute("password_error", true);
            return "/registration";
        }
    }

}
