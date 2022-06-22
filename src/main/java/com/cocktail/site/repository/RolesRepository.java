package com.cocktail.site.repository;

import com.cocktail.site.Entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends JpaRepository <Role, Long> {
}
