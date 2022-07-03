package com.cocktail.site.Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Coctails")
@Getter
@Setter
@NoArgsConstructor
public class Cocktail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @Column(nullable = false)
    private String name;

    @ElementCollection(targetClass = Integer.class)
    private List<Integer> ingList;

    @Column(nullable = false)
    private String href;

    @Column(nullable = false)
    private String photo;

    public Cocktail(String name, String photo, String href, List<Integer> ingList) {
        this.photo = photo;
        this.name = name;
        this.ingList = ingList;
        this.href = href;
    }
}
