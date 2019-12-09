package com.primisen.java_november.part4.ingredient.vegetable.category.leaf.entity;

import com.primisen.java_november.part4.ingredient.vegetable.category.leaf.type.LeafType;
import com.primisen.java_november.part4.ingredient.vegetable.entity.Vegetable;

public class Leaf extends Vegetable {

    private LeafType type;

    public Leaf(int calorie) {
        super(calorie);
    }

    public Leaf(int calorie, LeafType type) {
        super(calorie);
        this.type = type;
    }

    public LeafType getType() {
        return type;
    }

    public void setType(LeafType type) {
        this.type = type;
    }
}
