package com.primisen.java_november.part4.dish.salad.entity;

import com.primisen.java_november.part4.dish.Dish;
import com.primisen.java_november.part4.ingredient.Ingredient;

import java.util.ArrayList;
import java.util.Comparator;

public class Salad implements Dish {

    private ArrayList<Ingredient> ingredients;

    public Salad(){
    }

    public Salad(ArrayList<Ingredient> ingredients){
        this.ingredients = ingredients;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
