package com.primisen.java_november.part4.ingredient.vegetable.category.root.entity;

import com.primisen.java_november.part4.ingredient.vegetable.category.root.type.RootVegetableType;
import com.primisen.java_november.part4.ingredient.vegetable.entity.Vegetable;

public class RootVegetable extends Vegetable {

    private RootVegetableType type;

    public RootVegetable(int calorie) {
        super(calorie);
    }

    public RootVegetable(int calorie, RootVegetableType type) {
        super(calorie);
        this.type = type;
    }

    public RootVegetableType getType() {
        return type;
    }

    public void setType(RootVegetableType type) {
        this.type = type;
    }
}
