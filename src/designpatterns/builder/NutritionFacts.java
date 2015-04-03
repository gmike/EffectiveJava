package designpatterns.builder;

/**
 * Created by Michas on 28/03/15.
 */
public class NutritionFacts {
    private final int servings;
    private final int servingsSize;
    private final int calories;
    private final int sodium;
    private final int fat;

    public NutritionFacts(Builder builder){
        this.servings = builder.servings;
        this.servingsSize= builder.servingsSize;
        this.calories = builder.calories;
        this.sodium = builder.sodium;
        this.fat = builder.fat;
    }

    public String toString(){
        return "servings: " + servings + "\n" +
                "servingSize: " + servingsSize + "\n" +
                "calories: " + calories + "\n" +
                "sodium: " + sodium + "\n" +
                "fat: " + fat + "\n";
    }

    public static class Builder{
        private final int servings;
        private final int servingsSize;
        private  int calories;
        private  int sodium;
        private  int fat;

        public Builder(int servings, int servingsSize){
            this.servings = servings;
            this.servingsSize = servingsSize;
        }

        public Builder calories(int calories){
            this.calories = calories;
            return this;
        }

        public Builder sodium(int sodium){
            this.sodium = sodium;
            return this;
        }

        public Builder fat(int fat){
            this.fat = fat;
            return this;
        }

        public NutritionFacts build(){
            return new NutritionFacts(this);
        }
    }

    public class InnerClass {

    }

}
