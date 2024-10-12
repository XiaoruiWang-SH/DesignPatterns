package org.example.builder;

public class NFBuilder {
    final int calories;
    /* Why this is set to protected access?
    * First of all, because these fields don't want to be accessed by users, they are
    * just belong to builder which is a tool, is meaningless to business. So they should not be public.
    * If users want to access the field, they should consider accessing these through NutritionFacts class.
    * Next, It can be set private, because it is used in class NutritionFacts. Usually, the two classes will
    * appear together(i.e. in same package), so it should be protected access.*/
    int carbs;
    int proteins;
    int fat;

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
    /* This is also called build function */
    public NutritionFacts fact() {
        return new NutritionFacts(this);
    }

}
