package com.cocktail.site.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Coctails")

public class Cocktail {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long ID;

    @Column(nullable = false)
    private String name;

    @ElementCollection(targetClass = Integer.class)
    private List <Integer> ingList;

    @Column(nullable = false)
    private String href;

    @Column(nullable = false)
    private String photo;


    ///////////////////////////////////////////////////////////////////////
    public Cocktail(String name, String photo, String href, List<Integer> ingList) {
        this.photo=photo;
        this.name = name;
        this.ingList = ingList;
        this.href = href;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getIngList() {
        return ingList;
    }

    public void setIngList(List<Integer> ingList) {
        this.ingList = ingList;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Cocktail(){}




}
