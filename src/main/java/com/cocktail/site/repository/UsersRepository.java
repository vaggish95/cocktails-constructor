package com.cocktail.site.repository;

import com.cocktail.site.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository <User, Long>  {
    User findByEmail(String email);
}
