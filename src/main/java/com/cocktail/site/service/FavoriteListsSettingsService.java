package com.cocktail.site.service;


import com.cocktail.site.Entities.Cocktail;
import com.cocktail.site.Entities.User;
import com.cocktail.site.repository.CocktailsRepository;
import com.cocktail.site.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.security.Principal;
import java.util.List;

@Service
public class FavoriteListsSettingsService {

    UsersRepository usersRepository;
    CocktailsRepository cocktailsRepository;

    @Autowired
    public FavoriteListsSettingsService(UsersRepository usersRepository, CocktailsRepository cocktailsRepository) {
        this.usersRepository = usersRepository;
        this.cocktailsRepository = cocktailsRepository;
    }

    public List<Cocktail> favoriteListGetter (Principal principal) {
        return usersRepository.findByName(principal.getName()).getFavoiteList();
    }

    public void addToFavoriteList (Principal principal, String newCocktailName) {
        if (notExistsInFavoriteList(principal, newCocktailName)) {
            List<Cocktail> existingFavoriteList = usersRepository.findByName(principal.getName()).getFavoiteList();
            existingFavoriteList.add(cocktailsRepository.findByName(newCocktailName));
            User userUpdate = usersRepository.findByName(principal.getName());
            userUpdate.setFavoiteList(existingFavoriteList);
            usersRepository.save(userUpdate);
        }
    }

    public void removeFromFavoriteList (Principal principal, String newCocktailName) {
        List <Cocktail> existingFavoriteList = usersRepository.findByName(principal.getName()).getFavoiteList();
        existingFavoriteList.remove(cocktailsRepository.findByName(newCocktailName));
        User userUpdate = usersRepository.findByName(principal.getName());
        userUpdate.setFavoiteList(existingFavoriteList);
        usersRepository.save(userUpdate);
    }

    private boolean notExistsInFavoriteList(Principal principal, String newCocktailName){
        Cocktail cocktail = cocktailsRepository.findByName(newCocktailName);
        List <Cocktail> existingFavoriteList = usersRepository.findByName(principal.getName()).getFavoiteList();

        if (existingFavoriteList.contains(cocktail)) {
            return false;
        } else return true;

    }

}
