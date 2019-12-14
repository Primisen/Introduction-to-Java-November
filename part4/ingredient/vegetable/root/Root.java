package com.primisen.java_november.part4.ingredient.vegetable.root;

import com.primisen.java_november.part4.ingredient.Ingredient;

import java.util.Objects;

public class Root extends Ingredient {

    private RootVegetableType type;
    private boolean aril; //кожура, шелуха

    public Root(int calorie) {
        super(calorie);
    }

    public Root(int calorie, RootVegetableType type) {
        super(calorie);
        this.type = type;
    }

    public Root(RootVegetableType type, boolean aril) {
        this.type = type;
        this.aril = aril;
    }

    public Root(int calorie, RootVegetableType type, boolean aril) {
        super(calorie);
        this.type = type;
        this.aril = aril;
    }

    public Root(int calorie, double carbohydrates, double fits, double proteins, RootVegetableType type, boolean aril) {
        super(calorie, carbohydrates, fits, proteins);
        this.type = type;
        this.aril = aril;
    }

    public Root(int calorie, double carbohydrates, double fits, double proteins, boolean clean, RootVegetableType type, boolean aril) {
        super(calorie, carbohydrates, fits, proteins, clean);
        this.type = type;
        this.aril = aril;
    }

    public Root(int calorie, double carbohydrates, double fits, double proteins, boolean clean, boolean crushed, RootVegetableType type, boolean aril) {
        super(calorie, carbohydrates, fits, proteins, clean, crushed);
        this.type = type;
        this.aril = aril;
    }

    public Root(int calorie, double carbohydrates, double fits, double proteins, boolean clean, boolean crushed, boolean boiled, boolean roasted, RootVegetableType type, boolean aril) {
        super(calorie, carbohydrates, fits, proteins, clean, crushed, boiled, roasted);
        this.type = type;
        this.aril = aril;
    }

    public RootVegetableType getType() {
        return type;
    }

    public void setType(RootVegetableType type) {
        this.type = type;
    }

    public boolean isAril() {
        return aril;
    }

    public void setAril(boolean aril) {
        this.aril = aril;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Root root = (Root) o;
        return aril == root.aril &&
                type == root.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, aril);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Root{");
        sb.append("type=").append(type);
        sb.append(", aril=").append(aril);
        sb.append('}');
        return sb.toString();
    }
}
