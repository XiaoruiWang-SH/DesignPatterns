package org.example.builder;

public class NFBuilder {
    final public int calories;
    protected int carbs;
    protected int proteins;
    protected int fat;

    public NFBuilder(int calories) {
        this.calories = calories;
    }

    public NFBuilder carbs(int carbs) {
        this.carbs = carbs;
        return this;
    }

    public NFBuilder proteins(int proteins) {
        this.proteins = proteins;
        return this;
    }

    public NFBuilder fat(int fat) {
        this.fat = fat;
        return this;
    }

    public NutritionFacts fact() {
        return new NutritionFacts(this);
    }

}
