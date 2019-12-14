package com.primisen.java_november.part4.ingredient;

import java.util.Comparator;
import java.util.Objects;

public abstract class Ingredient implements Comparable<Ingredient> {

    private int calorie;
    private double carbohydrates; //углеводы
    private double fits; //жиры
    private double proteins; //белки
    private boolean clean;
    private boolean crushed; //ингредиент измельчен или нет
    private boolean boiled; //отваренный ли
    private boolean roasted; //обжарка

    public Ingredient() {
        calorie = 0;
        carbohydrates = 0;
        fits = 0;
        proteins = 0;
        clean = false;
        crushed = false;
        boiled = false;
        roasted = false;
    }

    public Ingredient(int calorie) {
        this.calorie = calorie;
    }

    public Ingredient(int calorie, double carbohydrates, double fits, double proteins) {
        this.calorie = calorie;
        this.carbohydrates = carbohydrates;
        this.fits = fits;
        this.proteins = proteins;
    }

    public Ingredient(int calorie, double carbohydrates, double fits, double proteins, boolean clean) {
        this.calorie = calorie;
        this.carbohydrates = carbohydrates;
        this.fits = fits;
        this.proteins = proteins;
        this.clean = clean;
    }

    public Ingredient(int calorie, double carbohydrates, double fits, double proteins, boolean clean, boolean crushed) {
        this.calorie = calorie;
        this.carbohydrates = carbohydrates;
        this.fits = fits;
        this.proteins = proteins;
        this.clean = clean;
        this.crushed = crushed;
    }

    public Ingredient(int calorie, double carbohydrates, double fits, double proteins, boolean clean, boolean crushed, boolean boiled, boolean roasted) {
        this.calorie = calorie;
        this.carbohydrates = carbohydrates;
        this.fits = fits;
        this.proteins = proteins;
        this.clean = clean;
        this.crushed = crushed;
        this.boiled = boiled;
        this.roasted = roasted;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public double getFits() {
        return fits;
    }

    public void setFits(double fits) {
        this.fits = fits;
    }

    public double getProteins() {
        return proteins;
    }

    public void setProteins(double proteins) {
        this.proteins = proteins;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }

    public boolean isCrushed() {
        return crushed;
    }

    public void setCrushed(boolean crushed) {
        this.crushed = crushed;
    }

    public boolean isBoiled() {
        return boiled;
    }

    public void setBoiled(boolean boiled) {
        this.boiled = boiled;
    }

    public boolean isRoasted() {
        return roasted;
    }

    public void setRoasted(boolean roasted) {
        this.roasted = roasted;
    }

    //
    @Override
    public int compareTo(Ingredient ingredient) {
        return this.getCalorie() - ingredient.getCalorie();
    }
}
