package com.primisen.java_november.part4.ingredient.vegetable.logic.comparator;

import com.primisen.java_november.part4.ingredient.Ingredient;

import java.util.Comparator;

public class FitsSaladComparator implements Comparator<Ingredient> {

    @Override
    public int compare(Ingredient ingredient1, Ingredient ingredient2){
        return ingredient1.getFits() - ingredient2.getFits();
    }
}
