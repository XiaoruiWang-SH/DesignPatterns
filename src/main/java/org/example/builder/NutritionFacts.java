package org.example.builder;

public class NutritionFacts {
    private final int calories;
    private final int carbs;
    private final int proteins;
    private final int fat;

    protected NutritionFacts(int calories, int carbs, int proteins, int fat) {
        this.calories = calories;
        this.carbs = carbs;
        this.proteins = proteins;
        this.fat = fat;
        if (carbs + proteins + fat != calories){
            throw new IllegalArgumentException();
        }
    }

    protected NutritionFacts(NFBuilder builder) {
        this.calories = builder.calories;
        this.carbs = builder.carbs;
        this.proteins = builder.proteins;
        this.fat = builder.fat;
        if (carbs + proteins + fat != calories){
            throw new IllegalArgumentException();
        }
    }

    public void printMe() {
        String s = String.format("the calories is %d, the carbs is %d, the proteins is %d, the fat is %d", calories, carbs, proteins, fat);
        System.out.println(s);
    }
}
