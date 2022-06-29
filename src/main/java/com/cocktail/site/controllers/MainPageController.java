package com.cocktail.site.controllers;

import com.cocktail.site.service.CocktailsSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/")
public class MainPageController {

    CocktailsSearchService cocktailsSearchService;

    @Autowired
    public MainPageController(CocktailsSearchService cocktailsSearchService) {
        this.cocktailsSearchService = cocktailsSearchService;
    }

    @GetMapping
    public String mainPage(Model model){
        model.addAttribute("ready_list", cocktailsSearchService.mainPage());
        return "mainPage";
    }


    @GetMapping(value = "/search/combinations")
    public String combinations(@RequestParam(name = "checkbox", required = false) List<Integer> parametersList, Model model) {
        if (parametersList == null) {
            return "mainPage";
        } else  {
            model.addAttribute("ready_list", cocktailsSearchService.combinations(parametersList));
            return "mainPage";
        }
    }

    @GetMapping(value = "/search/fullMatch")
    public String fullMatchCocktail(@RequestParam(name = "checkbox", required = false) List<Integer> parametersList, Model model) {
        if (parametersList == null) {
            return "mainPage";
        } else {
            model.addAttribute("ready_list", cocktailsSearchService.fullMatchCocktail(parametersList));
            return "mainPage";
        }
    }

    @GetMapping(value = "/search/anyMatch")
    public String anyMatchCocktail (@RequestParam(name = "checkbox", required = false) List<Integer> parametersList, Model model) {

        if (parametersList == null) {
            model.addAttribute("ready_list", cocktailsSearchService.allCocktails());
            return "mainPage";
        } else {

        model.addAttribute("ready_list", cocktailsSearchService.anyMatchCocktail(parametersList));
        return "mainPage";
    }
}
}