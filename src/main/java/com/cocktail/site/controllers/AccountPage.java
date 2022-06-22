package com.cocktail.site.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountPage {

    @GetMapping("/account")
    public String viewProvider (){
        return "kotik";
    }

}
