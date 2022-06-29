package com.cocktail.site.repository;

import com.cocktail.site.Entities.Cocktail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CocktailsRepository extends JpaRepository <Cocktail, Long> {
    Cocktail findByName(String name);
}
