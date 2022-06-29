package com.cocktail.site.repository;

import com.cocktail.site.Entities.Cocktail;
import com.cocktail.site.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository <User, Long> {
    User findByEmail(String email);
    User findByName(String name);
}




