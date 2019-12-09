package com.primisen.java_november.part4.chef;

import com.primisen.java_november.part4.dish.Dish;
import com.primisen.java_november.part4.ingredient.Ingredient;

import java.util.ArrayList;

public interface Chef {

    Dish cook(ArrayList<Ingredient> ingredients);
}
