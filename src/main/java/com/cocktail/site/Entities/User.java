package com.cocktail.site.Entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "users")
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

    public List<Cocktail> getFavoiteList() {
        return favoiteList;
    }

    public void setFavoiteList(List<Cocktail> favoiteList) {
        this.favoiteList = favoiteList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPassword_repeat() {
        return password_repeat;
    }

    public void setPassword_repeat(String password_repeat) {
        this.password_repeat = password_repeat;
    }

    public String getCreationDate() {
        return creationDate.format(DateTimeFormatter.ofPattern("HH:mm   dd/MM/yyyy"));
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public User (String name, String email, String password, String city, String photo) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.city = city;
        this.photo = photo;
        this.creationDate = LocalDateTime.now();
    }

    public User () {
    }








}
