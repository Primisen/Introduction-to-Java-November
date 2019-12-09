package com.primisen.java_november.part4.dish.salad.logic;

import com.primisen.java_november.part4.chef.Chef;
import com.primisen.java_november.part4.dish.salad.entity.Salad;
import com.primisen.java_november.part4.ingredient.Ingredient;
import com.primisen.java_november.part4.ingredient.vegetable.logic.comparator.CarbohydratesSaladComparator;
import com.primisen.java_november.part4.ingredient.vegetable.logic.comparator.FitsSaladComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SaladLogic implements Chef {

    @Override
    public Salad cook(ArrayList<Ingredient> ingredients) {
        return new Salad(ingredients);
    }

    public int countCalories(Salad salad) {

        int calories = 0;

        for (int i = 0; i < salad.getIngredients().size(); i++) {
            calories += salad.getIngredients().get(i).getCalorie();
        }

        return calories;
    }

    public ArrayList<Ingredient> findIngredient(Salad salad, int minCalorie, int maxCalorie) {

        ArrayList<Ingredient> findIngredient = null;

        for (int i = 0; i < salad.getIngredients().size(); i++) {

            int currentCalorie = salad.getIngredients().get(i).getCalorie();

            if (currentCalorie <= maxCalorie) {
                if (currentCalorie >= minCalorie) {
                    findIngredient.add(salad.getIngredients().get(i));
                }
            }
        }

        return findIngredient;
    }

    public void sort(Salad salad) {
        Collections.sort(salad.getIngredients());
    }

    public void sort(Salad salad, CarbohydratesSaladComparator carbohydrateComparator){
        Collections.sort(salad.getIngredients(), carbohydrateComparator);
    }

    public void sort(Salad salad, FitsSaladComparator fitsComparator){
        Collections.sort(salad.getIngredients(), fitsComparator);
    }

    public void sortAll(Salad salad){
        salad.getIngredients().sort(Comparator.comparing(Ingredient::getCalorie)
                .thenComparing(Ingredient::getCarbohydrates)
                .thenComparingInt(Ingredient::getFits));
    }
}
