package com.primisen.java_november.part4.ingredient.vegetable.category.fruit.entity;

import com.primisen.java_november.part4.ingredient.vegetable.entity.Vegetable;
import com.primisen.java_november.part4.ingredient.vegetable.category.fruit.type.FruitType;

public class Fruit extends Vegetable {

    private FruitType name;

    public Fruit(int calorie) {
        super(calorie);
    }

    public Fruit(int calorie, FruitType name) {
        super(calorie);
        this.name = name;
    }

    public FruitType getName() {
        return name;
    }

    public void setName(FruitType name) {
        this.name = name;
    }
}
