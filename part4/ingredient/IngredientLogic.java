package com.primisen.java_november.part4.ingredient;

public class IngredientLogic {

    public void wash(Ingredient ingredient){
        ingredient.setClean(true);
    }

    public void crush(Ingredient ingredient){
        ingredient.setCrushed(true);
    }

    public void boil(Ingredient ingredient){
        ingredient.setBoiled(true);
    }

    public void roast(Ingredient ingredient){
        ingredient.setRoasted(true);
    }
}
