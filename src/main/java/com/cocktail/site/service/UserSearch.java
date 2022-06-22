package com.cocktail.site.service;


import com.cocktail.site.Entities.Role;
import com.cocktail.site.Entities.User;
import com.cocktail.site.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class UserSearch implements UserDetailsService {

    private UsersRepository usersRepository;

    @Autowired
    public UserSearch(UsersRepository usersRepository){
        this.usersRepository = usersRepository;
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

    User user = findByEmail(email);
        if (user == null) {
            throw new UsernameNotFoundException(String.format("User '%s' not found", email));
        }
        return new org.springframework.security.core.userdetails.User(user.getName(), user.getPassword(), mapRolesToAuthorities(user.getRoles()));
    }

    public User findByEmail(String email) {
        return usersRepository.findByEmail(email.toLowerCase());
    }

    private Collection <? extends GrantedAuthority> mapRolesToAuthorities (Collection <Role> roles) {
        return roles.stream().map( role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toSet());
    }


}
