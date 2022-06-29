package com.cocktail.site.controllers;


import com.cocktail.site.Entities.User;
import com.cocktail.site.service.AccountCreatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/registration")
public class RegistrationController {

    AccountCreatorService accountCreatorService;

    @Autowired
    public RegistrationController(AccountCreatorService accountCreatorService) {
        this.accountCreatorService = accountCreatorService;
    }

    @GetMapping
    public String login (){
        return "registration";
    }

    @PostMapping
    public String signIn (User user, Model model){

        if  (user.getPassword().equals(user.getPassword_repeat())) {
            accountCreatorService.save(user);
            return "login";
        }
        else {
            model.addAttribute("password_error", true);
            return "/registration";
        }
    }

}
