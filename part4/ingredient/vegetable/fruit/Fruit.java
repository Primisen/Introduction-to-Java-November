package com.primisen.java_november.part4.ingredient.vegetable.fruit;

import com.primisen.java_november.part4.ingredient.Ingredient;

import java.util.Objects;

public class Fruit extends Ingredient { //плодовые

    private FruitType name;
    private boolean seed; //наличие семян

    public Fruit(int calorie) {
        super(calorie);
    }

    public Fruit(int calorie, FruitType name) {
        super(calorie);
        this.name = name;
    }

    public Fruit(FruitType name, boolean seed) {
        this.name = name;
        this.seed = seed;
    }

    public Fruit(int calorie, FruitType name, boolean seed) {
        super(calorie);
        this.name = name;
        this.seed = seed;
    }

    public Fruit(int calorie, double carbohydrates, double fits, double proteins, FruitType name, boolean seed) {
        super(calorie, carbohydrates, fits, proteins);
        this.name = name;
        this.seed = seed;
    }

    public Fruit(int calorie, double carbohydrates, double fits, double proteins, boolean clean, FruitType name, boolean seed) {
        super(calorie, carbohydrates, fits, proteins, clean);
        this.name = name;
        this.seed = seed;
    }

    public Fruit(int calorie, double carbohydrates, double fits, double proteins, boolean clean, boolean crushed, FruitType name, boolean seed) {
        super(calorie, carbohydrates, fits, proteins, clean, crushed);
        this.name = name;
        this.seed = seed;
    }

    public Fruit(int calorie, double carbohydrates, double fits, double proteins, boolean clean, boolean crushed, boolean boiled, boolean roasted, FruitType name, boolean seed) {
        super(calorie, carbohydrates, fits, proteins, clean, crushed, boiled, roasted);
        this.name = name;
        this.seed = seed;
    }

    public FruitType getName() {
        return name;
    }

    public void setName(FruitType name) {
        this.name = name;
    }

    public boolean isSeed() {
        return seed;
    }

    public void setSeed(boolean seed) {
        this.seed = seed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return seed == fruit.seed &&
                name == fruit.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, seed);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fruit{");
        sb.append("name=").append(name);
        sb.append(", seed=").append(seed);
        sb.append('}');
        return sb.toString();
    }
}
