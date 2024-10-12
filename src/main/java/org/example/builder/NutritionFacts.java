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
    /* This constructor is only visible to builder*/
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

    /*
    // This is an another solution of builder pattern(i.e. Implement builder class as an inner class in product class)
    public static  class NFCBuilder {
        final public int calories;
        protected int carbs;
        protected int proteins;
        protected int fat;

        public NFCBuilder(int calories) {
            this.calories = calories;
        }

        public NFCBuilder carbs(int carbs) {
            this.carbs = carbs;
            return this;
        }

        public NFCBuilder proteins(int proteins) {
            this.proteins = proteins;
            return this;
        }

        public NFCBuilder fat(int fat) {
            this.fat = fat;
            return this;
        }
        *//* This is also called build function *//*
        public NutritionFacts fact() {
            return new NutritionFacts(this);
        }

    }*/
}
