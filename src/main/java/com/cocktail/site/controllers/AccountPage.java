package com.cocktail.site.controllers;

import com.cocktail.site.repository.UsersRepository;
import com.cocktail.site.service.AccountSettings;
import com.cocktail.site.service.FavoriteListSettings;
import org.springframework.beans.factory.annotation.Autowired;
import com.cocktail.site.service.CocktailsSearch;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.security.Principal;

@Controller
public class AccountPage {

    UsersRepository usersRepository;
    AccountSettings accountSettings;
    FavoriteListSettings favoriteListSettings;

    @Autowired
    public AccountPage(UsersRepository usersRepository, AccountSettings accountSettings, FavoriteListSettings favoriteListSettings) {
        this.usersRepository = usersRepository;
        this.accountSettings = accountSettings;
        this.favoriteListSettings = favoriteListSettings;
    }

    @GetMapping("/account")
    public String account (Model model, Principal principal){
        model.addAttribute("account_holder", usersRepository.findByName(principal.getName()));
        model.addAttribute("personal_list", favoriteListSettings.favoriteListGetter(principal));
        return "account";
    }

    @GetMapping ("/password_reset")
    public String passportReset (){
        return "passwordReset";
    }

    @PostMapping ("/password_reset")
    public String passportReset (
                                  @RequestParam (name = "oldPassword") String oldPassword,
                                 @RequestParam (name = "newPassword") String newPassword,
                                 @RequestParam (name = "password_repeat") String passwordRepeat,
                                  Principal principal,
                                  Model model) {
        model.addAttribute("message", accountSettings.resetPassword(principal, oldPassword, newPassword, passwordRepeat));
        return "passwordReset";
    }

    @PostMapping ("/delete")
    public String deleteAccout (Principal principal){
        accountSettings.removeUser(principal);
        return "login";
    }

    @PostMapping ("/addFavorite")
    public String addFavorite (@RequestParam (name = "addFavorite") String favoriteCocktail, Principal principal, Model model) {
        favoriteListSettings.addToFavoriteList(principal, favoriteCocktail);
        model.addAttribute(favoriteListSettings.favoriteListGetter(principal));
        model.addAttribute("ready_list", CocktailsSearch.getPreviousParametersList());
        return "mainPage";
    }

    @PostMapping ("/remove_favorite")
    public String deleteFromFavorite (@RequestParam (name = "removeFavorite") String removeFavorite, Principal principal, Model model) {
        favoriteListSettings.removeFromFavoriteList(principal, removeFavorite);
        model.addAttribute("account_holder", usersRepository.findByName(principal.getName()));
        model.addAttribute("personal_list", favoriteListSettings.favoriteListGetter(principal));
        return "account";
    }

    @GetMapping ("/support")
    public String support() {
        return "kotik";
    }






}
