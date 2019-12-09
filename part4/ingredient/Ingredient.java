package com.primisen.java_november.part4.ingredient;

import java.util.Comparator;

public class Ingredient implements Comparable<Ingredient> {

    private int calorie;
    private int carbohydrates; //углеводы
    private int fits; //жиры

    public Ingredient(int calorie) {
        this.calorie = calorie;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public int getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(int carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public int getFits() {
        return fits;
    }

    public void setFits(int fits) {
        this.fits = fits;
    }

    @Override
    public int compareTo(Ingredient ingredient) {
        return this.getCalorie() - ingredient.getCalorie();
    }
}
