package com.cocktail.site.Entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "users")
@NoArgsConstructor
@Setter
@Getter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column (name = "password")
    private String password;

    @Transient
    private String password_repeat;

    @Column(name = "city")
    private String city;

    @Getter(AccessLevel.NONE)
    @Column(name= "creation_date")
    private LocalDateTime creationDate;

    @ManyToMany
    @JoinTable(
                name = "users_roles",
                joinColumns = @JoinColumn(name = "user_id"),
                inverseJoinColumns = @JoinColumn(name = "role_id" ))
    private Collection <Role> roles;

    @ElementCollection(targetClass = Cocktail.class)
    private List <Cocktail> favoiteList;

    @Column(name = "photo")
    private String photo;

    public String getCreationDate() {
        return creationDate.format(DateTimeFormatter.ofPattern("HH:mm   dd/MM/yyyy"));
    }

    public User (String name, String email, String password, String city, String photo) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.city = city;
        this.photo = photo;
        this.creationDate = LocalDateTime.now();
    }
}
