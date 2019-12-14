package com.primisen.java_november.part4.ingredient.vegetable.leaf;

import com.primisen.java_november.part4.ingredient.Ingredient;

import java.util.Objects;

public class Leaf extends Ingredient {

    private LeafType type;
    private boolean dried; //обсушенный(в качестве специи)

    public Leaf(int calorie) {
        super(calorie);
    }

    public Leaf(int calorie, LeafType type) {
        super(calorie);
        this.type = type;
    }

    public Leaf(LeafType type, boolean dried) {
        this.type = type;
        this.dried = dried;
    }

    public Leaf(int calorie, LeafType type, boolean dried) {
        super(calorie);
        this.type = type;
        this.dried = dried;
    }

    public Leaf(int calorie, double carbohydrates, double fits, double proteins, LeafType type, boolean dried) {
        super(calorie, carbohydrates, fits, proteins);
        this.type = type;
        this.dried = dried;
    }

    public Leaf(int calorie, double carbohydrates, double fits, double proteins, boolean clean, LeafType type, boolean dried) {
        super(calorie, carbohydrates, fits, proteins, clean);
        this.type = type;
        this.dried = dried;
    }

    public Leaf(int calorie, double carbohydrates, double fits, double proteins, boolean clean, boolean crushed, LeafType type, boolean dried) {
        super(calorie, carbohydrates, fits, proteins, clean, crushed);
        this.type = type;
        this.dried = dried;
    }

    public Leaf(int calorie, double carbohydrates, double fits, double proteins, boolean clean, boolean crushed, boolean boiled, boolean roasted, LeafType type, boolean dried) {
        super(calorie, carbohydrates, fits, proteins, clean, crushed, boiled, roasted);
        this.type = type;
        this.dried = dried;
    }

    public LeafType getType() {
        return type;
    }

    public void setType(LeafType type) {
        this.type = type;
    }

    public boolean isDried() {
        return dried;
    }

    public void setDried(boolean dried) {
        this.dried = dried;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Leaf leaf = (Leaf) o;
        return dried == leaf.dried &&
                type == leaf.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, dried);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Leaf{");
        sb.append("type=").append(type);
        sb.append(", dried=").append(dried);
        sb.append('}');
        return sb.toString();
    }
}
