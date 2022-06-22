package com.cocktail.site.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/about")
public class InfoPage {

    @GetMapping
    public String about (){
        return "about";
    }


}
