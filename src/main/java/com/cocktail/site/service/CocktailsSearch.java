package com.cocktail.site.service;

import com.cocktail.site.Entities.Cocktail;
import com.cocktail.site.repository.CocktailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class CocktailsSearch {

    static List <Cocktail> PREVIOUS_PARAMETERS_LIST;

    CocktailsRepository cocktailsRepository;

    @Autowired
    public CocktailsSearch(CocktailsRepository cocktailsRepository) {
        this.cocktailsRepository = cocktailsRepository;
    }

    public List <Cocktail>  mainPage() {
        List <Cocktail> initialList = new ArrayList<>();
        initialList.add((cocktailsRepository.findById(38L)).get());
        initialList.add((cocktailsRepository.findById(20L)).get());
        initialList.add((cocktailsRepository.findById(59L)).get());
        initialList.add((cocktailsRepository.findById(43L)).get());
        initialList.add((cocktailsRepository.findById(34L)).get());
        initialList.add((cocktailsRepository.findById(56L)).get());
        PREVIOUS_PARAMETERS_LIST = initialList;
        return initialList;
    }

    public List <Cocktail> combinations(List<Integer> parametersList) {

        List <Cocktail> allCocktails = cocktailsRepository.findAll();
        List <Cocktail> ready_list = new ArrayList<>();

        for (Cocktail cocktail: allCocktails ) {
            int count = 0;
            for (int x = 0; x < parametersList.size(); x ++ ){
                for (int j = 0; j < cocktail.getIngList().size(); j ++ ) {
                    if ( parametersList.get(x).equals(cocktail.getIngList().get(j))) {
                        count ++;
                    }
                }
            }

            if (count == cocktail.getIngList().size()) {
                ready_list.add(cocktail);
            }
        }

        PREVIOUS_PARAMETERS_LIST = ready_list;
        return ready_list;
    }

    public List <Cocktail> allCocktails (){
        return cocktailsRepository.findAll();
    }

    public List <Cocktail> fullMatchCocktail( List<Integer> parametersList) {
        Collections.sort(parametersList);
        List <Cocktail> allCocktails = cocktailsRepository.findAll();
        List <Cocktail> readyList = new ArrayList<>();

        for (Cocktail cocktail: allCocktails ) {

            if (cocktail.getIngList().size() == parametersList.size()) {
                boolean flag = false;
                Collections.sort(cocktail.getIngList());
                for (int x = 0; x < parametersList.size(); x ++ ){
                    if (parametersList.get(x).equals(cocktail.getIngList().get(x))) {
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    readyList.add(cocktail);
                }
            }
        }

        PREVIOUS_PARAMETERS_LIST = readyList;
        return readyList;
    }

    public List<Cocktail> anyMatchCocktail (List<Integer> parametersList) {
        Collections.sort(parametersList);
        List <Cocktail> cocktailList = cocktailsRepository.findAll();
        List <Cocktail> readyList = new ArrayList<>();

        for (Cocktail cocktail: cocktailList ) {
            Collections.sort(cocktail.getIngList());
            for (int x = 0; x < parametersList.size(); x ++ ){
                for (int j = 0; j < cocktail.getIngList().size(); j ++ ) {
                    if ( parametersList.get(x).equals(cocktail.getIngList().get(j))) {
                        readyList.add(cocktail);
                        x = parametersList.size();
                        break;
                    }
                }
            }
        }

        PREVIOUS_PARAMETERS_LIST = readyList;
        return readyList;
    }

    public static List<Cocktail> getPreviousParametersList() {
        return PREVIOUS_PARAMETERS_LIST;
    }


}


